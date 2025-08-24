package thirteen_abstraction;

import java.util.Scanner;

public class LMSGradePaymentTracker {

    public static void main(String[] args) {
        Personable student = new Student();
        student.setPersonDetails();
        student.displayPersonDetails();
        student.achievementStatus();
        ((Payables)student).calculatePayment();

        Personable trainer = new Trainer();
        trainer.setPersonDetails();
        trainer.displayPersonDetails();
        ((Payables)trainer).calculatePayment();
    }

}
