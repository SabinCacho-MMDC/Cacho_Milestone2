package com.mmdc.milestone2;

public class Employee extends BaseEmployee implements SalaryCalculator{
    private double netSalary;
    private int taxPercent;
    
    public Employee(String employeeID, String firstName, String lastName, int birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, Status status, String position, double basicSalary, double allowance, double netSalary, int taxPercent){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.status = status;
        this.position = position;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.netSalary = netSalary;
        this.taxPercent = taxPercent;
    }
    
    @Override
    public double calculateNetSalary(){
        return (basicSalary + allowance) * (basicSalary * (taxPercent / 100));
    }
}
