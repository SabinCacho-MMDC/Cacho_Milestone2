package com.mmdc.milestone2;

import java.io.*;

public class EmployeeDatabase {
    private String employeeFile;
    private String credentialFile;
    
    public EmployeeDatabase(String employeeFile, String credentialFile){
        this.employeeFile = employeeFile;
        this.credentialFile = credentialFile;
    }
    
    public EmployeeDatabase (String employeeFile){
        this.employeeFile = employeeFile;
    }
    
    public String validateCredentials(String employeeID, String password){ //method used to validate logins, returns employeeID
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader(credentialFile));
            
            while((line = reader.readLine()) != null){
                data = line.split(",");
                if (data[0].equals(employeeID) && data[1].equals(password)){
                    return employeeID;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }
}
