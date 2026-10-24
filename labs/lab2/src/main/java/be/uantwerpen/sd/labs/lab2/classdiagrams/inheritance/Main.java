package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        /*
            TODO: Create instances of each role and pass them (as Employee) to printWage(...) to verify polymorphism.
            TIP: Upcast to Employee and keep fields private/protected as appropriate.
        */
        Employee employee = new Employee(20.0, 8.0);
        Employee officer = new DepartmentOfficer(25.0, 8.0, 50.0);
        Employee programmer = new Programmer(30.0, 8.0, 10.0, 5.0);
        Employee customerService = new CustomerService(18.0, 8.0, 5.0, 12.0);

        printWage("Standard employee", employee);
        printWage("Department Officer", officer);
        printWage("Programmer", programmer);
        printWage("Customer Service", customerService);

    }

    public void printWage(String name, Employee e) {
        /*
            TODO: Once Employee.calculateDailySalary exists, print the salary for each employee.
            TIP: Use: System.out.println(\"Employee \" + name + \": salary = \" + e.calculateDailySalary());
        */
        System.out.println("Employee " + name + ": salary = " + e.calculateDailySalary());
    }
}
