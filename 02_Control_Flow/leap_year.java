import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter your year-");
        int year=value.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("It is a leap yaer");
        }
        else if(year%400==0 && year%100==0){
            System.out.println("It is a leap yaer");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
    
}
