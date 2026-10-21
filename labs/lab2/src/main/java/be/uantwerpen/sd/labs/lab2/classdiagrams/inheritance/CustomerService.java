package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

/*
TODO: Implement CustomerService according to the UML Diagram.
Fields you will need:
  - double bonusPerCustomer
  - double numberOfCustomers
Methods you will implement:
  - double calculateDailySalary()
TIP: Start from your class diagram; add fields first, then implement the required methods. Don't forget to actually inherit from Employee.
*/
public class CustomerService extends Employee {

    protected double bonusPerCustomer;
    protected double numberOfCustomers;

    public CustomerService(double hourlySalary, double hoursWorked, double bonusPerCustomer , double numberOfCustomers) {
        super(hourlySalary, hoursWorked);


    }

    @Override
    public double calculateDailySalary() {
        return super.calculateDailySalary() + (bonusPerCustomer * numberOfCustomers);
    }
}
