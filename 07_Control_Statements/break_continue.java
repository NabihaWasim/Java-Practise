//use of break and continue in loops
import java.util.Scanner;
public class break_continue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entyer the number:");
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            //contniue statemnet skips tye iterartion
            if(i==10){
                System.out.println("invalid number");
                continue;
            }
            System.out.println("Who let the dogs out "+i);
            //break sttaement exits the loop immedietly
            if(i==40){
                System.out.println("Time to break the loop");
                break;
            }
        }
    }  
}
