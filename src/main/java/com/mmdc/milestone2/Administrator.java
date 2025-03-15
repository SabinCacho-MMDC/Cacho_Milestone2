package com.mmdc.milestone2;

public class Administrator extends BaseEmployee{
    public Administrator(String employeeID, String firstName, String lastName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagIbigNumber, String status, String position, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSalary, double hourlyRate){
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
        this.riceSubsidy = riceSubsidy; //14
        this.phoneAllowance = phoneAllowance; //15
        this.clothingAllowance = clothingAllowance; //16
        this.grossSalary = grossSalary; //17
        this.hourlyRate = hourlyRate; //18
    }
}
