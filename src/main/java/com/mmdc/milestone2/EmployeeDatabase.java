package com.mmdc.milestone2;

import java.io.*;
import java.util.ArrayList;

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
    
    public EmployeeDatabase(){} //default constructor
    
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
    
    public ArrayList<String[]> getAttendanceFromFile(String employeeID, String attendanceFile){
        ArrayList<String[]> attendanceLog = new ArrayList<String[]>();
        String[] attendanceEntryDetails;
        
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader(attendanceFile));
            
            while((line = reader.readLine()) != null){
                data = line.split(",");
                attendanceEntryDetails = new String[6];
                if (data[0].equals(employeeID)){
                    attendanceEntryDetails[0] = data[0]; //ID
                    attendanceEntryDetails[1] = data[1]; //Last Name
                    attendanceEntryDetails[2] = data[2]; //First Name
                    attendanceEntryDetails[3] = data[3]; //Date
                    attendanceEntryDetails[4] = data[4]; //Time in
                    attendanceEntryDetails[5] = data[5]; //Time out
                    
                    attendanceLog.add(attendanceEntryDetails); //appends entry to log list
                }
            }
            return attendanceLog;
        }
        catch(IOException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }
    
    public double calculateSalaryFromAttendance(String employeeID, ArrayList<String[]> attendanceLog){
        
        
        return 0;
    }
}
