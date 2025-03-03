package com.mmdc.milestone2;

import java.io.*;

public class EmployeeDatabase {
    private String employeeFile;
    private String credentialFile;
    
    public EmployeeDatabase(String employeeFile, String credentialFile){
        this.employeeFile = employeeFile;
        this.credentialFile = credentialFile;
    }
    
    public String validateCredentials(String employeeID, String password){
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader("credentials.csv"));
            
            while((line = reader.readLine()) != null){
                data = line.split(",");
                
                if (data[0].equals(employeeID) && data[1].equals(password)){
                    return employeeID;
                }
            }
        }
        catch(IOException e){
            e.getLocalizedMessage();
        }
        return null;
    }
    
    //TODO: add methods to read and write to employee and credential files and validate login
}
