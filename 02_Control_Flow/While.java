import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Number of terms in series-");
        int n=input.nextInt();
        int i=1;
        while(i!=n){
            System.out.print (i +" ");
            i++;
        }
    }
}
