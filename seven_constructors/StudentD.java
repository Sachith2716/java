package seven_constructors;

import java.util.Scanner;

public class StudentD {
    int studentID;
    String studentName;
    int StudentAge;
    long StudentMobileNumber;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    double totalCredits;
    int trainerRating;
    int totalScore = 0;
    int numberOfSubjects =0;

    public StudentD(){

    }

    public StudentD(int studentID, String studentName){
        this.studentID=studentID;
        this.studentName=studentName;
    }

    public StudentD(int studentID, String studentName, int StudentAge, long StudentMobileNumber){
        this.studentID=studentID;
        this.studentName=studentName;
        this.StudentAge=StudentAge;
        this.StudentMobileNumber=StudentMobileNumber;
    }




    public void StudentDInfo(){
        System.out.println("====== STUDENT BAISC INFO======");
        System.out.println("Enter StudentId: ");
        studentID = sc.nextInt();
        System.out.println("Enter StudentName: ");
        studentName = sc.next();
        
    }

    Scanner sc = new Scanner((System.in));
    public int sessionsDCredits() {
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

    public double scoreDCredits(){
        char continueInput = 'y';
        while (continueInput == 'y' || continueInput == 'Y') {
            System.out.println("Enter Score For Subject: "+(numberOfSubjects+1));
            int currentScore = sc.nextInt();
            totalScore+=currentScore;
            numberOfSubjects++;
            System.out.println("Do you want to add another score (y/n): ");
            continueInput = sc.next().charAt(0);
        }
        double avgScore = (double) totalScore/numberOfSubjects;
        return avgScore;
    }
    
    public void achievementDStatus() {
        totalCredits = sessionsDCredits() + scoreDCredits();
        if (totalCredits>=10) {
            System.out.println("==GOLD==");
        } else if (totalCredits>=8) {
            System.out.println("==SILVER==");
        } else {
            System.out.println("==NEED IMPROVEMENT==");
        }
    }
    public int trainerDRatings() {
        System.out.println("Enter Trainer Rating: (1-5)");
        trainerRating = sc.nextInt();

        if (trainerRating==5) {
            return 5000;
        } else {
            return 0;
        }
    }

}
