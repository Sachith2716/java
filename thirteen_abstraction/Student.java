package thirteen_abstraction;

import java.util.Scanner;

public class Student extends AbstractPerson implements Personable, Payables{

    private static String instituteName;
    private static String courseName;
    private static double globalDiscount;



    static{
        instituteName = "Edify";
        courseName ="Java";
        globalDiscount = 0.1;
    }

    private int totalSessionsAttended;
    private int attendanceCredits;
    private int performanceCredits;
    private int totalCredits;
    private int trainerRating;
    private String studentDescription;
    private double courseFee;


    private int [] subjectScores;


    public String getStudentDescription() {
        return studentDescription;
    }


    public void setStudentDescription(String studentDescription) {
        this.studentDescription = studentDescription;
    }


    public double getCourseFee() {
        return courseFee;
    }


    public void setCourseFee(double courseFee) {
        if (courseFee>0) {
            this.courseFee = courseFee;
        } else {
            System.out.println("Fee is invalid");
        }
    }


    public void setPersonDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======= Enter Student Details =======");
        System.out.println("Enter Student ID: ");
        setPersonID(sc.nextInt());

        System.out.println("Enter Student Name: ");
        setPersonName(sc.next());

        System.out.println("Enter Student Age: ");
        setPersonAge(sc.nextInt());

        System.out.println("Enter Student Mobile Number: ");
        setPersonMobileNumber(sc.nextLong());
        sc.nextLine();

        System.out.println("Enter Description: ");
        setStudentDescription(sc.nextLine());

        System.out.println("Enter Course Fee: ");
        setCourseFee(sc.nextDouble());


    }


    public void displayPersonDetails(){
        System.out.println("======= Student Info =======");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Mobile: "+getPersonMobileNumber());
    }

    public void calculatePayment(){
        double discount = 0;
        String description = getStudentDescription();

        if (description.contains("reference")) {
            discount += 5000;
        } 
        if (description.contains("scholarship")) {
            discount += 7000;
        } 
        if (description.contains("promo")) {
            discount += 3000;
        }
        
        // final fee 
        discount += courseFee * globalDiscount;
        double finalFee = courseFee - discount;
        System.out.println("Original Quoted Fees: "+courseFee);
        System.out.println("Discount Applied: "+discount);
        System.out.println("Site Wide Discount Applied: "+(courseFee * globalDiscount));
        System.out.println("Final Fee After Discount: "+finalFee);


    }

    //For Taking Inputs 
    Scanner sc= new Scanner(System.in);

    // calculating attendance credits -> no input

    public int sessionsCredits(){
        System.out.println("Enter Total Sessions Attended: ");
        totalSessionsAttended = sc.nextInt();
        if (totalSessionsAttended>=30) {
            return attendanceCredits += 5;
        } else if (totalSessionsAttended>=20) {
            return attendanceCredits += 3;
        } else {
            return 0;
        }
    }

    // calculate Average Score
    public int calculateAverageScore() {
        System.out.println("Enter Number Of Subjects: ");
        int numSubjects = sc.nextInt();
        // dynamic array init
        subjectScores = new int[numSubjects];
        
        int sum = 0;

        // read score one by one
        for (int i = 0; i < subjectScores.length; i++) {
            System.out.println("Enter Score For Subject: "+(i+1));
            subjectScores[i] = sc.nextInt();
            sum = sum + subjectScores[i];
        }

    

        // Average score
        int avgScore = sum / subjectScores.length;

        // For Validating
        System.out.println("Total Score: "+sum);
        System.out.println("Average Score: "+avgScore);

        return avgScore;
        
    }

     // calculating performance credits -> with input
    // score is a parameter i.e used as local
    public int scoreCredits(int avgScore) {
        if (avgScore >=85) {
            return performanceCredits += 5;
        } else if(avgScore >=60) {
            return performanceCredits += 3;
        } else {
            return 0;
        }
    }

    // calculating achievement status -> as it's a contract
    public void achievementStatus() {
        totalCredits = sessionsCredits() + scoreCredits(calculateAverageScore());
        if (totalCredits>=10) {
            System.out.println("==GOLD==");
        } else if (totalCredits>=8) {
            System.out.println("==SILVER==");
        } else {
            System.out.println("==NEED IMPROVEMENT==");
        }
    }

    // assign trainer rating
    public int trainerRatings() {
        System.out.println("Enter Trainer Rating: (1-5)");
        trainerRating = sc.nextInt();

        if (trainerRating==5) {
            return 5000;
        } else {
            return 0;
        }
    }
}
