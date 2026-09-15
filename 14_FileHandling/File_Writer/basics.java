import java.io.IOException;
import java.io.FileWriter;
public class basics{
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("Basics.txt");
            writer.write("hey!");
            writer.close();
        }catch(IOException e){
            System.out.println("Error."+e.getMessage());
        }
        System.out.println("Success.");
    }
}