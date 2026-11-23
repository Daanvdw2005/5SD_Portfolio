package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;


public class CustomerService extends Employee {

    protected double bonusPerCustomer;
    protected double numberOfCustomers;

    public CustomerService(double hourlySalary, double hoursWorked, double bonusPerCustomer , double numberOfCustomers) {
        super(hourlySalary, hoursWorked);
        this.bonusPerCustomer = bonusPerCustomer;
        this.numberOfCustomers = numberOfCustomers;
    }

    @Override
    public double calculateDailySalary() {
        return super.calculateDailySalary() + (bonusPerCustomer * numberOfCustomers);
    }
}
