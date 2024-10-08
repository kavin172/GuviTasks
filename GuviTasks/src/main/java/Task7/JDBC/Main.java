package Task7.JDBC;

import java.sql.*;

public class Main {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/employeedb";
    private static final String JDBC = "jdbc:mysql://localhost:3307";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
    private static final String CREATE_TABLE = "CREATE TABLE employee (empcode INT PRIMARY KEY, empname VARCHAR(30), empage INT, esalary INT)";
    private static final String DB_NAME = "employeedb";
    private static final String TABLE_NAME = "employee";

    public static void main(String[] args) {
        Main employee = new Main();
        if (employee.isDatabaseExistsOrCreate()) {
            employee.addEmployee(101, "Jenny", 25, 10000);
            employee.addEmployee(102, "Jacky", 30, 20000);
            employee.addEmployee(103, "Joe", 20, 40000);
            employee.addEmployee(104, "John", 40, 80000);
            employee.addEmployee(105, "Shameer", 25, 90000);
        }
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public void addEmployee(int empCode, String empName, int empAge, double eSalary) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setInt(1, empCode);
            preparedStatement.setString(2, empName);
            preparedStatement.setInt(3, empAge);
            preparedStatement.setDouble(4, eSalary);

            int rowAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted employee: " + empName + " - Rows affected: " + rowAffected);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error inserting employee: " + empName);
            e.printStackTrace();
        }
    }

    public boolean isDatabaseExistsOrCreate() {
        try (Connection connection = DriverManager.getConnection(JDBC, USERNAME, PASSWORD)) {

            try (Connection dbConnection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                return true;
            }
        } catch (SQLException e) {
            if (e.getErrorCode() == 1049) {
                System.out.println("Database does not exist. Creating now...");
                return createDatabase();
            } else {
                System.err.println("Connection error: " + e.getMessage());
                return false;
            }
        }
    }

    private boolean createDatabase() {
        try (Connection connection = DriverManager.getConnection(JDBC, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            String createDBQuery = "CREATE DATABASE " + DB_NAME;
            statement.executeUpdate(createDBQuery);
            System.out.println("Database created successfully.");


            try (Connection dbConnection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
                 Statement createTableStatement = dbConnection.createStatement()) {
                if (!isTableExists(TABLE_NAME)) {
                    createTableStatement.execute(CREATE_TABLE);
                    System.out.println("Table created successfully.");
                }
            }
            return true; 
        } catch (SQLException e) {
            System.err.println("Error creating database: " + e.getMessage());
            return false;
        }
    }

    public boolean isTableExists(String tableName) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            DatabaseMetaData dbMetaData = connection.getMetaData();
            try (ResultSet resultSet = dbMetaData.getTables(null, null, tableName, new String[]{"TABLE"})) {
                return resultSet.next(); 
            }
        } catch (SQLException e) {
            System.err.println("Error while checking if table exists: " + e.getMessage());
        }
        return false;
    }
}
