package com.company.PayrollModifyed;

public class CommissionEmployee2 extends Employee2 {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    // constructor
    public CommissionEmployee2(String firstName, String lastName,
                               String socialSecurityNumber, double grossSales,
                               double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }


    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString() +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

}
