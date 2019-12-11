package com.company.Payroll;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", new Date(1, 12, 1999), 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(13, 9, 1998),16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", new Date(23, 8, 2000),10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", new Date(18, 7, 2001),5000, .04, 300);

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

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {

                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }
            System.out.printf(
                    "earned $%,.2f%n%n", currentEmployee.earnings());
        } // end for
// get type name of each object in employees array
        double earnings = 0.0;
        for (int j = 0; j < employees.length; j++) {
            for (int i = 1; i <= 12; i++) {
              if (employees[j].getBirthDate().getMonth() == i) {
                  earnings = employees[j].earnings() + 100;
                  System.out.println("*Happy birthday*");
              }
              else {
                  earnings = employees[j].earnings();
              }
              System.out.printf("Employee %8s have salary %f in %2d month \n", employees[j].getFirstName(), earnings, i);
          }
            System.out.println("----------------------Next Employee----------------------");
      }
    } // end main
}

