package com.mmdc.milestone2;

abstract class BaseEmployee {
    public BaseEmployee(String employeeID, String name, double grossSalary, String address){
        this.employeeID = employeeID;
        this.name = name;
        this.grossSalary = grossSalary;
        this.address = address;
    }
    
    private String employeeID;
    private String name;
    private double grossSalary;
    private String address;
    
    public String getEmployeeID(){
        return employeeID;
    }
    
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getGrossSalary(){
        return grossSalary;
    }
    
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}
