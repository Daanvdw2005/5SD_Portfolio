package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {

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
        System.out.println("Employee " + name + ": salary = " + e.calculateDailySalary());
    }
}
