//Create a number guessing game where the program selects a 
// random number, and the user has to guess it.
import java.util.Scanner;
public class no_guess {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int random=(int)(Math.random()*10)+1;
        //System.out.println(random);
        int guess;
        int chance=0;
        do{
            System.out.print("Guess the number:");
            guess=input.nextInt();
            if(guess>random){
                System.out.print("Guess again but smaller:");
            }else if(guess<random){
                System.out.print("Guess again but higher:");
            }
            else{
                System.out.println("Congrats");
            }
            chance++;
            
        }while(guess!=random);
        System.out.println("Total chsnce: "+chance);
        
    }
    
}
