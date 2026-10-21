package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import be.uantwerpen.sd.labs.lab2.classdiagrams.relations.Program;

/*
TODO: Implement Programmer according to the UML Diagram.
Fields you will need:
  - double bonusPerBug
  - double numberOfBugs
Methods you will implement:
  - double calculateDailySalary()
TIP: Start from your class diagram; add fields first, then implement the required methods. Don't forget to actually inherit from Employee.
*/
public class Programmer extends Employee {
    protected double bonusPerBug;
    protected double numberOfBugs;

    public Programmer(double hourlySalary, double hoursWorked, double bonusPerBug, double NumberOfBugs){
        super(hourlySalary,hoursWorked);
        this.bonusPerBug = bonusPerBug;
        this.numberOfBugs = bonusPerBug;
    }

    @Override
    public double calculateDailySalary() {
        return super.calculateDailySalary() + (bonusPerBug * numberOfBugs);
    }
}
