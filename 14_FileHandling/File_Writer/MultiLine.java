import java.io.IOException;
import java.io.FileWriter;
public class MultiLine {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("MultiLine.txt");
            writer.write("Hey\n");
            writer.write("this is nabiha\n");
            writer.write("dekh kya re ho uncle.");
            writer.close();
            System.out.println("Success.");
        }catch(IOException exc){
            System.out.println("error"+exc.getMessage());
        }
    }
}
