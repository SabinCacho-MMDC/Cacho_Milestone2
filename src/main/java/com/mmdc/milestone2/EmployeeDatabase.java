package com.mmdc.milestone2;

import com.opencsv.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmployeeDatabase {    
    public String validateCredentials(String employeeID, String password){ //returns employeeID if valid, null if not
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader(FilePath.credentialsPath));
            
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
    
    public ArrayList<String[]> getAttendanceFromFile(String employeeID){
        ArrayList<String[]> attendanceLog = new ArrayList<String[]>();
        String[] attendanceEntryDetails;
        
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader(FilePath.attendanceLogPath));
            
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
    
    public ArrayList<String[]> getAllEmployees(){
        ArrayList<String[]> employeeList = new ArrayList<String[]>();
        String[] employee;
        
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader(FilePath.employeeDetailsPath));
            
            while((line = reader.readLine()) != null){
                data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                employee = new String[5];
                
                employee[0] = data[0]; //ID
                employee[1] = data[1]; //Last Name
                employee[2] = data[2]; //First Name
                employee[3] = data[11]; //Status
                employee[4] = data[10]; //Position
                employeeList.add(employee); //appends entry to log list
            }
            return employeeList;
        }
        catch(IOException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }
    
    public void updateEmployeeEntry(String employeeID, String[] changes){
        try{
            File employeesFile = new File(FilePath.employeeDetailsPath);
            CSVReader employeeListReader = new CSVReaderBuilder(new FileReader(employeesFile)).build();
            List<String[]> employeeList = employeeListReader.readAll();
            
            for(int i = 0; i < employeeList.size(); i++){
                if(employeeList.get(i)[0].equals(employeeID)){
                    employeeList.get(i)[0] = changes[5];
                    employeeList.get(i)[1] = changes[0];
                    employeeList.get(i)[2] = changes[1];
                    employeeList.get(i)[3] = changes[3];
                    employeeList.get(i)[4] = changes[11];
                    employeeList.get(i)[5] = changes[6];
                    employeeList.get(i)[6] = changes[7];
                    employeeList.get(i)[7] = changes[8];
                    employeeList.get(i)[8] = changes[10];
                    employeeList.get(i)[9] = changes[9];
                    employeeList.get(i)[10] = changes[4];
                    employeeList.get(i)[11] = changes[2];
                    
                    break;
                }
            }
            employeeListReader.close();
            
            CSVWriter writer = new CSVWriter(new FileWriter(employeesFile));
            writer.writeAll(employeeList, false);
            writer.flush();
            writer.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, "Entry successfully updated.");
        
        DetailDisplayGUI detailDisplay = new DetailDisplayGUI(employeeID);
        detailDisplay.setVisible(true);
    }
    
}
