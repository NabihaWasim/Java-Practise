import java.util.Scanner;
public class Shorthand {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=5;
        System.out.print("Enter value of x-");
        int x=input.nextInt();
        System.out.println("Addition-"+(x+=a));
        System.out.println("Subtraction-"+(x-=a));
        System.out.println("Multiplication-"+(x*=a));
        System.out.println("Division-"+(x/=a));  
    }
}
