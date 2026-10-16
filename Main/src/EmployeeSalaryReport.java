public class EmployeeSalaryReport {

    int employeeNumber;
    String employeeName;
    double salary;

    EmployeeSalaryReport(int employeeNumber, String employeeName,double salary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee number: " + this.employeeNumber);
        System.out.println("Employee name: " + this.employeeName);
        System.out.println("Salary: R" + this.salary);
    }

    void determineThreshold() {
        if (this.salary < 10000) {

            System.out.println("Threshold: Less than R10000\n");

        } else if (this.salary >= 10000 && this.salary < 20000) {

            System.out.println("Threshold: Between 10000 and 20000\n");

        } else {
            System.out.println("Threshold: Above 20000\n");
        }
    }

    void determineAverageSalary(EmployeeSalaryReport[] employees) {

        double total = 0;

        for (int i = 0; i < employees.length; i++) {
            total = total + employees[i].salary;
        }

        double average = total / employees.length;

        System.out.println("Average salary: R" + average + "\n");
    }

    void determineHighestSalary(EmployeeSalaryReport[] employees) {

        double highest = 0;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i].salary > highest) {
                highest = employees[i].salary;
            }

        }

        System.out.println("Highest salary: R" + highest);
    }

}
