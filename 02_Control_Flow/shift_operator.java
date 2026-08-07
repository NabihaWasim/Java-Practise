import java.util.Scanner;
public class shift_operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=input.nextInt();
        //left shift operator
        int result_left=num<<1; //shifts bits one position to the left → roughly (num × 2)
        //right shift opearator
        int result_right=num>>1;  //shifts bits one position to the right → roughly (num ÷ 2) for positive integers.

        System.out.println("Left shift is: "+result_left);
        System.out.println("Right shift is: "+result_right);
    }
}