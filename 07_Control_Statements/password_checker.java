//using do-while to find password checker until a valid password is entered.
import java.util.Scanner;
public class password_checker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the password you wanna set:");
        String correct_pass=input.nextLine();
        String password;

        do{
            System.out.println("Enter password:");
            password=input.nextLine();
            if(password.equals(correct_pass)){
                System.out.println("Password is correct");
            }else{
                System.out.println("INcorrext password");
            }
        }while(!password.equals(correct_pass));

        
    }
    
}
