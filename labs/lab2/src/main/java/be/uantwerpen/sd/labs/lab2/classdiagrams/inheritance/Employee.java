package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;


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
