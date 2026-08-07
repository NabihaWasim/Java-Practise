import java.util.Scanner;
public class relational_operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter age");
        int age=input.nextInt();
        System.out.println("AGE IS:"+age);
        if(age<5 || age>60){
            System.out.println("Eliginble for 50% discount");

        }
        else if(age>20 && age<60){
            System.out.print("No discount");
        } 
    }
}
