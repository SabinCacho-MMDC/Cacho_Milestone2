package com.mmdc.milestone2;

abstract class BaseEmployee {    
    //TODO: edit attributes according to CP2 csv files
    protected String employeeID;
    protected String firstName;
    protected String lastName;
    protected String birthday;
    protected String address;
    protected String phoneNumber;
    protected String sssNumber;
    protected String philhealthNumber;
    protected String tinNumber;
    protected String pagIbigNumber;
    protected String status;
    protected String position;
    protected double basicSalary;
    protected double allowance;
    protected double grossSalary;
    protected double hourlyRate;
    
    
    public String getEmployeeID(){
        return employeeID;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLirstName(){
        return lastName;
    }
    
    public String getBirthday(){
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
    
    public String getStatus(){
        return status;
    }
    
    public String getPosition(){
        return position;
    }
    
    public double getBasicSalary(){
        return basicSalary;
    }
    
    public double getAllowance(){
        return allowance;
    }
    
    public double getGrossSalary(){
        return grossSalary;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
}
