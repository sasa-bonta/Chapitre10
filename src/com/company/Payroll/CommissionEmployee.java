package com.company.Payroll;

public class CommissionEmployee extends Employee{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    // constructor
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, Date birthDate, double grossSales,
                              double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
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

    @Override
    public Date getBirthDate() {
        return super.getBirthDate();
    }
}
