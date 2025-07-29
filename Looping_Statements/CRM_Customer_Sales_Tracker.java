package Looping_Statements;

import java.util.Scanner;

public class CRM_Customer_Sales_Tracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Customer ID: ");
         int Customer_ID = sc.nextInt();

        System.out.print("Enter the Customer Name: ");
         String Customer_Name = sc.next();
        
         double Customer_Total_Purchases_Amount = 0;

        int No_Transcations = 0;

        char validation_check = 'y';
        while(validation_check == 'y' || validation_check == 'Y'){
            No_Transcations++;
            System.out.print("Enter Amount of "+No_Transcations+" Sale : ");
             double Sale = sc.nextInt();
             Customer_Total_Purchases_Amount+=Sale;
            
            
            System.out.print("Do you Want Add 1 More Transction Amount (y/n): ");
            validation_check = sc.next().charAt(0);
            
        }

        sc.close();
        
        double Average_Sales = Customer_Total_Purchases_Amount/No_Transcations;
        
        System.out.println("Customer ID: "+Customer_ID);
        System.out.println("Customer Name: "+Customer_Name);
        System.out.println("Customer Total Sales: "+Customer_Total_Purchases_Amount);
        System.out.println("Customer Average Sales: "+Average_Sales);
         if(Customer_Total_Purchases_Amount >= 50000){
            System.out.println("Customer Status Level: Platinum");
         }
         else if(Customer_Total_Purchases_Amount >=25000 && Customer_Total_Purchases_Amount <=49999){
            System.out.println("Customer Status Level: Gold");
         }
         else if(Customer_Total_Purchases_Amount >=10000 && Customer_Total_Purchases_Amount <=24999){
            System.out.println("Customer Status Level: Silver");
         }
         else{
            System.out.println("Customer Status Level: Bronze");
         }
         System.out.println((No_Transcations < 5) ? "!Warning less than 5 Transctions with this customer":"No of Transcations Done: "+No_Transcations);
        
    }

}
