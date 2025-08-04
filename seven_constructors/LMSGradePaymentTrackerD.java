package seven_constructors;

public class LMSGradePaymentTrackerD {

    public static void main(String[] args) {
        StudentD s1=new StudentD(101,"Sachith");
        StudentD s2= new StudentD(102, "mahi", 21, 987654321);
        //s2.trainerDRatings();
        TrainerD t2= new TrainerD();
        t2.trainerDInfo();
        t2.sessionsDPayments();


        
        
    }

}
