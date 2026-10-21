package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

/*
TODO: Implement Employee according to the UML Diagram.
Fields you will need:
  - double hourlySalary
  - double hoursWorked
Methods you will implement:
  - double calculateDailySalary()
TIP: Start from your class diagram; add fields first, then implement the required methods.
*/
public class Employee {
    protected double hourlySalary;
    protected double hoursWorked;


    public double  calculateDailySalary(){
        return hourlySalary * hoursWorked;
    }

    public Employee (double hourlySalary, double hoursWorked){
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }
}
