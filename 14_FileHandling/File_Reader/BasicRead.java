import java.io.FileReader;
import java.io.IOException;
public class BasicRead {
    public static void main(String[] args) {
        try{
            FileReader read=new FileReader("Basics.txt");
            read.close();
        }
        catch(IOException exception){
            System.out.println("error"+exception.getMessage());
        }
    }
}
