package com.company.Payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      Date birthDate, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                super.toString() +
                "baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public Date getBirthDate() {
        return super.getBirthDate();
    }
}
