package com.mmdc.milestone2;

public class Employee extends BaseEmployee implements SalaryCalculator{
    private double netSalary;
    private int taxPercent;
    
    public Employee(String employeeID, String name, double currentGrossSalary, String address){
        super(employeeID, name, currentGrossSalary, address);
        taxPercent = 5;
    }
    
    public double calculateNetSalary(){
        return netSalary = getGrossSalary() - (getGrossSalary() * (taxPercent/100d));
    }
}
