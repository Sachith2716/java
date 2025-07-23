package Operators;

public class CarEMI {
    public static void main(String[] args) {
        String CarName = "Mahindra Scorpio S11";
        int OnRoadPrice = 2190887;
        int DownPayment = 380000;
        double BankIntrestrate = 7.3;
        int loanperiod = 24;

        int loanamount = OnRoadPrice - DownPayment; // Arithmetic Operators(Sub)
        double monthlyRate = BankIntrestrate/12/100; // Arithmetic Operators(div)
        double a = Math.pow((1+monthlyRate), loanperiod);// Math.pow() function is used for the Calculation of the power values 
        double emiPerMonth = loanamount * monthlyRate * (a/(a-1)); //Arithmetic Operators
        //double emiPerMonth = loanamount * monthlyRate * (Math.pow((1+monthlyRate), loanperiod)/(java.lan.Math.pow(1+monthlyRate) , loanperiod-1));
        System.out.println("Car Name: "+CarName);
        System.out.println("OnRoadPrice: "+OnRoadPrice);
        System.out.println("DownPayment: "+DownPayment);
        System.out.println("BankIntrestrate: "+BankIntrestrate);
        System.out.println("loanperiod: "+loanperiod);
        System.out.println("emiPerMonth: "+emiPerMonth);


    }

}
