/*File Not Found Exception Handling
Write a program to read a filename from the user and display its content.
The program should handle the situation where the file does not exist.
Key Points:
• Use Scanner to read the filename from the user.
• Use FileReader to read the file content.
• Implement a try-catch block to handle FileNotFoundException.
• Display a message informing the user if the file is not found.*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileNotFound {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the file name u wanna read:");
        String FileName=input.next();
        try{
            FileReader reader=new FileReader(FileName);
            int read;
            while((read=reader.read())!=-1){
                System.out.print((char)read);
            }
        }catch(FileNotFoundException exception){
            System.out.println(FileName+"not found.");
        }
        catch(IOException exception){
            System.out.println("Error"+exception.getMessage());
        }
        
    }
    
}
