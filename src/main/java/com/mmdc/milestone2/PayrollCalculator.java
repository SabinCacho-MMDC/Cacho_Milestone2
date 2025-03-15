package com.mmdc.milestone2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    private double sssContribution;
    private double philHealthContribution;
    private double pagIbigContribution;
    private double withholdingTax;
    private double grossMonthlySalary;
    private double taxableIncome;
    
    public PayrollCalculator(double grossMonthlySalary){
        this.grossMonthlySalary = grossMonthlySalary;
        taxableIncome = calculateTaxableIncome();
    }
    
    public double calculateSssContribution(){ //determine SSS contribution based on sss_contributions.csv
        try{
            String line;
            String[] data;
            BufferedReader reader = new BufferedReader(new FileReader("..\\Cacho_Milestone2\\src\\resources\\sss_contributions.csv"));
            
            while((line = reader.readLine()) != null){
                data = line.split(",");
                if(grossMonthlySalary <= Double.parseDouble(data[1]) && grossMonthlySalary <= Double.parseDouble(data[0])){
                    return Double.parseDouble(data[2]);
                }
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return 0d;
    }
    
    public double calculatePhilHealthContribution(){
        if (grossMonthlySalary <= 10000.00d){
            return 300d;
        }
        else if (grossMonthlySalary <= 59999.99d && grossMonthlySalary > 10000d){
            return (grossMonthlySalary * .3d) / 2d;
        }
        else return 1800d;
    }
    
    public double calculatePagIbigContribution(){
        if (grossMonthlySalary <= 1500d){
            return grossMonthlySalary * .1d;
        }
        else{
            if (grossMonthlySalary * .2d > 100d)
                return 100d;
            else return grossMonthlySalary * .2d;
        }
    }
    
    public double calculateTaxableIncome(){
        return ((grossMonthlySalary - calculateSssContribution()) - calculatePhilHealthContribution()) - calculatePagIbigContribution();
    }
    
    public double calculateWithholdingTax(){
        calculateTaxableIncome();
        if(taxableIncome >= 666667d){
            return 200833.33d + ((taxableIncome - 666667d) * .35d);
        }
        else if(taxableIncome < 666667d && taxableIncome >= 166667d){
            return 40833.33d + ((taxableIncome - 166667d) * .32d);
        }
        else if(taxableIncome < 166667d && taxableIncome >= 66667d){
            return 10833.33d + ((taxableIncome - 66667d) * .30d);
        }
        else if(taxableIncome < 66667d && taxableIncome >= 33333d){
            return 2500d + ((taxableIncome - 33333d) * .25d);
        }
        else if(taxableIncome < 33333d && taxableIncome >= 20833d){
            return (taxableIncome - 20833d) * .20d;
        }
        return 0d;
    }
    
    public double calculateNetMonthlySalary(){
        return (((grossMonthlySalary - calculateSssContribution()) - calculatePhilHealthContribution()) - calculatePagIbigContribution()) - calculateWithholdingTax();
    }
}
