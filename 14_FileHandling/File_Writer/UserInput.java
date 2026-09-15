import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        try{
            FileWriter user=new FileWriter("Userinput.txt");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter text:");
            String name=input.nextLine();
            user.write("txt below\n");
            user.write(name);
            user.close();
            System.out.println("done check your file");

        }catch(IOException exc){
            System.out.println("error"+exc.getMessage());
        }
    }    
}
