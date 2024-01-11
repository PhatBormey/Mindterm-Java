package java_Midterm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Midterm {
    public void convertDate(){
        Scanner input=new Scanner(System.in);
        String sdate;
        System.out.print("Enter Date (YYYY-MM-DD) : ");
        sdate=input.nextLine();
        input.close();
        try{
            SimpleDateFormat sdateInput = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdateInput.parse(sdate);
            SimpleDateFormat sdateOutput = new SimpleDateFormat("MMMM dd, yyyy");
            String fullDate = sdateOutput.format(date);
            System.out.println("Full Date is : " + fullDate);

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        }
    }
}
