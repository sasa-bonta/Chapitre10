package com.company.PayrollModifyed;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee2 salariedEmployee =
                new SalariedEmployee2("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee2 hourlyEmployee =
                new HourlyEmployee2("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee2 commissionEmployee =
                new CommissionEmployee2(
                        "Sue", "Jones", "333-33-3333",10000, .06);
        BasePlusCommissionEmployee2 basePlusCommissionEmployee =
                new BasePlusCommissionEmployee2(
                        "Bob", "Lewis", "444-44-4444",5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker(
                      "Morris", "Thomas", "555-55-555", 12, 55);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                pieceWorker,
                "earned", pieceWorker.earnings());

        Employee2[] employee2s = new Employee2[5];

        employee2s[0] = salariedEmployee;
        employee2s[1] = hourlyEmployee;
        employee2s[2] = commissionEmployee;
        employee2s[3] = basePlusCommissionEmployee;
        employee2s[4] = hourlyEmployee;
        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee2 currentEmployee2 : employee2s) {
            System.out.println(currentEmployee2);

            if (currentEmployee2 instanceof BasePlusCommissionEmployee2) {

                BasePlusCommissionEmployee2 employee =
                        (BasePlusCommissionEmployee2) currentEmployee2;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }
            System.out.printf(
                    "earned $%,.2f%n%n", currentEmployee2.earnings());
        }

    }
}

