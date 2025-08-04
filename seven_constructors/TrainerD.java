package seven_constructors;

import java.util.Scanner;

public class TrainerD {

    int trainerID;
    String trainerName;
    int trainerAge;
    long trainerMoblieNumber;
    int totalSessionsTaken;
    int paymentForSessions;
    int totalPayment;
    Scanner sc = new Scanner(System.in);

    public TrainerD(){

    }
    public TrainerD(int trainerID, String trainerName, int trainerAge, long trainerMoblieNumber){
        this.trainerID=trainerID;
        this.trainerName=trainerName;
        this.trainerAge=trainerAge;
        this.trainerMoblieNumber=trainerMoblieNumber;
    }

    public TrainerD(int trainerID, String trainerName){
        this(101,"Sachith",21,987654345);
    }

    public void trainerDInfo() {
        System.out.println("====== TRAINER INFO======");
        System.out.println("Trainer ID: ");
        trainerID = sc.nextInt();
        System.out.println("Trainer Name: ");
        trainerName = sc.next();
    }

    public void sessionsDPayments() {
        
        System.out.println("Enter Total Sessions Taken: ");
        totalSessionsTaken = sc.nextInt();
        paymentForSessions = 1500 * totalSessionsTaken;

        // Access student object to inject rating
        StudentD studentObj = new StudentD();
        System.out.println("==== Student Rating====");
        int trainingBouns = studentObj.trainerDRatings();
        int totalPayment = paymentForSessions + trainingBouns;
        System.out.println("==== Trainer Payment====");
        System.out.println("Total Payment To Be Made: "+totalPayment);

    }

}
