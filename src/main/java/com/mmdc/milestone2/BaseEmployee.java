package com.mmdc.milestone2;

abstract class BaseEmployee {    
    //TODO: edit attributes according to CP2 csv files
    protected String employeeID;
    protected String firstName;
    protected String lastName;
    protected int birthday;
    protected String address;
    protected String phoneNumber;
    protected String sssNumber;
    protected String philhealthNumber;
    protected String tinNumber;
    protected Status status;
    protected String position;
    protected double basicSalary;
    protected double allowance;
    
    
    public String getEmployeeID(){
        return employeeID;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLirstName(){
        return lastName;
    }
    
    public int getBirthday(){
        return birthday;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getSSSNumber(){
        return sssNumber;
    }
    
    public String getPhilhealthNumber(){
        return philhealthNumber;
    }
    
    public String getTIN(){
        return tinNumber;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public String getPosition(){
        return position;
    }
    
    public double basicSalary(){
        return basicSalary;
    }
    
    public double getAllowance(){
        return allowance;
    }
    
    
}
