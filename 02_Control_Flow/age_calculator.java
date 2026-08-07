import java.util.Scanner;
public class age_calculator {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=value.nextInt();
        if(age<6){
            System.out.println("You are a kid.");
        }
        else if(age>6 && age<18){
            System.out.println("You are a minor.");
        }
        else if(age>=18 && age<60){
            System.out.println("You are officially an adult.");
        }
        else if(age>60 && age<=150){
            System.out.println("You are a senior citizen.");
        }
        else if(age>150){
            System.out.println("You must have died,sorry.");
        }
        else{
            System.out.println("Invalid age input.");
        }  
    }  
}
