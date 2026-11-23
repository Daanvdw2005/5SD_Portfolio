package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

public class Programmer extends Employee {
    protected double bonusPerBug;
    protected double numberOfBugs;

    public Programmer(double hourlySalary, double hoursWorked, double bonusPerBug, double NumberOfBugs){
        super(hourlySalary,hoursWorked);
        this.bonusPerBug = bonusPerBug;
        this.numberOfBugs = NumberOfBugs;
    }

    @Override
    public double calculateDailySalary() {
        return super.calculateDailySalary() + (bonusPerBug * numberOfBugs);
    }
}
