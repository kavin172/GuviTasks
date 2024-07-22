package Task3.TaxSystem;

class Employee implements Taxable{

    private final int empId;
    private final String name;
    private final double salary;
    private double tax;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        this.tax = salary * incomeTaxPercent;
    }

    public String toString() {
        return " Employee ID = " + empId + "\tEmployee name = " + name + " \tEmployee Salary = "+ salary +"\tIncome Tax = "+ tax;
    }

}