//Calculate the area and circumference 
// of a circle for a given radiusvusing Math.PI
import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter radius:");
        int radius=input.nextInt();
        double area=Math.PI*radius*Math.pow(radius,2);
        double circum=2*Math.PI*radius;
        System.out.println("Area is:"+area);
        System.out.println("Circumference is:"+circum); 
    } 
}
