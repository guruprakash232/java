package javatask;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFunction {


    public static void AddDateMonthYear(String date, int days, int months, int years) throws ParseException {
      
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        Date inputDate = format.parse(date); // Storing input date
        
        System.out.println("The Given date is : " + format.format(inputDate)); // Printing User input
        
        Calendar outputDate = Calendar.getInstance();
        outputDate.setTime(inputDate);
        outputDate.add(Calendar.DATE, days);
        outputDate.add(Calendar.MONTH, months);
        outputDate.add(Calendar.YEAR, years);
        
        int day = outputDate.get(Calendar.DATE);
        int month = outputDate.get(Calendar.MONTH) + 1; 
        int year = outputDate.get(Calendar.YEAR);
        
        System.out.println("After Adding Given Date/Month/Year: " + day + "/" + month + "/" + year);
        
    }

    public static void main(String[] args) throws ParseException {
    	
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Date (dd/MM/yyyy):");
        String userInput = obj.nextLine();
        
        
        int defaultDays = 4;// Default values
        int defaultMonths = 4;// Default values
        int defaultYears = 4;// Default values
        
        
        AddDateMonthYear(userInput, defaultDays, defaultMonths, defaultYears);// Calling Method
        
        obj.close(); 
    }
}
