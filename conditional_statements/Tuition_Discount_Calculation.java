package conditional_statements;

public class Tuition_Discount_Calculation {
    public static void main(String[] args) {
        byte grade_level = 12;
        double tuition_fee = 25000;
        double Discount_percentage = 0;
        boolean AcademicTopper = true;
        if (grade_level>=9 && grade_level<=12) {
            if(AcademicTopper==true){
                Discount_percentage =20;
            }else {
                Discount_percentage =10;
            } 
        }else if (grade_level>=6 && grade_level <= 8) {
            Discount_percentage =5;
        }else if (grade_level>0 && grade_level<6) {
            Discount_percentage =0;
        }else {
            System.out.println("Invadlid Grade");
        }
        if (grade_level==10) {
            Discount_percentage+=3;
            
        }else if(grade_level == 12){
            Discount_percentage +=5;
        }else {
            Discount_percentage+=0;
        }

        double total_fee = tuition_fee - (tuition_fee * Discount_percentage/100);
        double discountedFee= tuition_fee-total_fee;
        System.out.println("Student's grade level: "+ grade_level);
        System.out.println("Base tuition fee: "+ tuition_fee);
        System.out.println("Total discount percentage: "+Discount_percentage);
        System.out.println("Discount Fee: "+discountedFee);
        System.out.println("Tuition fee after the discount: "+total_fee);



    }

}
