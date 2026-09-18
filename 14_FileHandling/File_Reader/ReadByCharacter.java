import java.io.FileReader;
import java.io.IOException;
public class ReadByCharacter {
    public static void main(String[] args) {
        try{
             FileReader reader=new FileReader("Message.txt");
             int data;
             while((data=reader.read())!=-1){
                System.out.print((char) data);
             }
            reader.close();
        }catch(IOException exception){
            System.out.println("Error"+exception.getMessage());
        }
       
    }
} 
