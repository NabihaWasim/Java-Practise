import java.util.Scanner;
public class Maths_formula {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        //Area of triangle
        System.out.print("Breadth of tringle-");
        double breadth=value.nextDouble();
        System.out.print("Height of triangle-");
        double height=value.nextDouble();
        double area=(0.5*breadth*height);
        System.out.println("Area of triangle is "+area);
        //Simple Interest and Compound Interest
        System.out.println("Enter principal amount,rate, and time-");
        int principal=value.nextInt();
        float rate=value.nextFloat();
        int time=value.nextInt();
        float simple_interest=((principal*rate*time)/100);
        System.out.println("Simple ineterst is- "+simple_interest);
        //Fahrenhite to Celcius
        System.out.println("Enter temperature in celcius-");
        int temp=value.nextInt();
        float temperature=((temp*9/5)+32);
        System.out.println("Temperature in fahrenhite is- "+temperature);
    }
    
}
