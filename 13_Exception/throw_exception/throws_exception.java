import java.util.Scanner;
public class throws_exception {
    public static int divide(int a,int b) throws ArithmeticException{
        int x=a/b;
        
        return x;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number:");
        int x=input.nextInt();
        int y=input.nextInt();
        try{
            int result=divide(x,y);
            System.out.println("Resukt is "+result);
        }catch(ArithmeticException e){
            System.out.println("Impossible"+e.getMessage());
        }
    }
}
