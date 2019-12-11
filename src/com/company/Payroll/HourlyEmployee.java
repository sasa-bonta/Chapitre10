package com.company.Payroll;

public class HourlyEmployee extends Employee {
    private double hours; // gross weekly sales
    private double wage; // commission
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                          double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168)
            System.out.println("Hours must be > 0 and < 168");
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0)
            System.out.println("Wage must be > 0");
        if (wage > 0)
            this.wage = wage;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                "hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public Date getBirthDate() {
        return super.getBirthDate();
    }
}
