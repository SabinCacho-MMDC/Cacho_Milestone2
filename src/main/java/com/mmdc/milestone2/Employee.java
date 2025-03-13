package com.mmdc.milestone2;

public class Employee extends BaseEmployee implements SalaryCalculator{
    private double netSalary;
    private int taxPercent;
    
    public Employee(String employeeID, String firstName, String lastName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagIbigNumber, String status, String position, double basicSalary, double allowance, double grossSalary, double hourlyRate){
        this.employeeID = employeeID; //0
        this.firstName = firstName; //2
        this.lastName = lastName; //1
        this.birthday = birthday; //3
        this.address = address; //4
        this.phoneNumber = phoneNumber; //5
        this.sssNumber = sssNumber; //6
        this.philhealthNumber = philhealthNumber; //7
        this.tinNumber = tinNumber; //8
        this.pagIbigNumber = pagIbigNumber; //9
        this.status = status; //10
        this.position = position; //11
        this.basicSalary = basicSalary; //13
        this.allowance = allowance; //15 + 16
        this.grossSalary = grossSalary; //17
        this.hourlyRate = hourlyRate; //18
    }
    
    @Override
    public double calculateNetSalary(){
        return (basicSalary + allowance) * (basicSalary * (taxPercent / 100));
    }
}
