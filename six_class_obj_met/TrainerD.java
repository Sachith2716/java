package six_class_obj_met;

import java.util.Scanner;

public class TrainerD {

    int trainerID;
    String trainerName;
    int totalSessionsTaken;
    int paymentForSessions;
    int totalPayment;
    Scanner sc = new Scanner(System.in);

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
