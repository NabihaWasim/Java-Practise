public class parameter {
    public static void main(String[] args) {
        System.out.println("Welcome to function calci-");
        sum_two_num(34,89);
        subtract_two_num(45,67);
        sum_two_num(-90,90);     
    }
    public static int sum_two_num(int x,int y){
        System.out.println("Received first number: "+x);
        System.out.println("Received second number: "+y);
        int sum=x+y;
        System.out.println("Sum is: "+sum);
        return sum;
    }
    public static int subtract_two_num(int x,int y){
        System.out.println("Received first number: "+x);
        System.out.println("Received second number: "+y);
        int subtract=x-y;
        System.out.println("Subtract is: "+subtract);
        return subtract;
    }
}
