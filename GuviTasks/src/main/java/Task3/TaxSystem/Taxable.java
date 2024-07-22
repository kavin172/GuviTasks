package Task3.TaxSystem;

public interface Taxable {

    public double salesTaxPercent = 0.07;

    public double incomeTaxPercent = 0.105;

    public void calcTax();

}