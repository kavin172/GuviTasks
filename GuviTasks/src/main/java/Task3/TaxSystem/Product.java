package Task3.TaxSystem;

class Product implements Taxable {
    private final int pid;
    private final double price;
    private final int quantity;
    private double tax;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        this.tax = price * quantity * salesTaxPercent;
    }

    public String toString() {
        return " Price ID = " + pid + "\tPrice amount = " + price  + " \tItem Quantity = "+ quantity +"\tSales Tax = "+ tax;
    }
}