package Task7.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDataInserter {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/employeedb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS Empl ("
            + "empno INT PRIMARY KEY, "
            + "ename VARCHAR(30), "
            + "job VARCHAR(30), "
            + "mgr INT, "
            + "hiredate DATE, "
            + "sal DOUBLE, "
            + "comm DOUBLE, "
            + "deptno INT)";

    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO Empl (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    public static void main(String[] args) {
        EmployeeDataInserter employeeDAO = new EmployeeDataInserter();

        employeeDAO.createTable();

        Object[][] employeeData = {
                {8369, "SMITH", "CLERK", 8902, "1990-12-18", 800.0, null, 20},
                {8499, "ANYA", "SALESMAN", 8698, "1991-02-20", 1600.0, 300.0, 30},
                {8521, "SETH", "SALESMAN", 8698, "1991-02-22", 1250.0, 500.0, 30},
                {8522, "MAHADEVAN", "MANAGER", 8839, "1991-04-02", 2985.0, null, 20},
                {8654, "MOMIN", "SALESMAN", 8698, "1991-09-28", 1250.0, 1400.0, 30},
                {8698, "BINA", "MANAGER", 8839, "1991-05-01", 2850.0, null, 30},
                {8882, "SHIVANSH", "MANAGER", 8839, "1991-06-09", 2450.0, null, 10},
                {8888, "SCOTT", "ANALYST", 8566, "1992-12-09", 3000.0, null, 10},
                {8839, "AMIR", "PRESIDENT", null, "1991-11-18", 5000.0, null, 10},
                {8844, "KULDEEP", "SALESMAN", 8698, "1991-09-08", 1500.0, 0.0, 30}
        };


        for (Object[] employee : employeeData) {
            employeeDAO.addEmployee(
                    (int) employee[0],
                    (String) employee[1],
                    (String) employee[2],
                    (Integer) employee[3],
                    (String) employee[4],
                    (Double) employee[5],
                    employee[6],
                    (int) employee[7]
            );
        }
    }

    public void createTable() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(CREATE_TABLE_SQL)) {
            preparedStatement.executeUpdate();
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    public void addEmployee(int empNo, String empName, String job, Integer mgr, String hireDate, double sal, Object comm, int deptNo) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {

            preparedStatement.setInt(1, empNo);
            preparedStatement.setString(2, empName);
            preparedStatement.setString(3, job);
            preparedStatement.setObject(4, mgr);
            preparedStatement.setDate(5, java.sql.Date.valueOf(hireDate));
            preparedStatement.setDouble(6, sal);
            if (comm == null) {
                preparedStatement.setNull(7, java.sql.Types.DOUBLE);
            } else {
                preparedStatement.setDouble(7, (Double) comm);
            }
            preparedStatement.setInt(8, deptNo);

            int rowAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted employee: " + empName + " - Rows affected: " + rowAffected);

        } catch (SQLException e) {
            System.out.println("Error inserting employee: " + empName);
            e.printStackTrace();
        }
    }
}
