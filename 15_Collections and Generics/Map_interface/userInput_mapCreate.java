import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class userInput_mapCreate {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Map<String,Integer> mapset=new HashMap<>();
        System.out.print("Enter size of map:");
        int size=input.nextInt();
        input.nextLine();
        System.out.println("Enter values:");
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print("Name-");
            String name=input.nextLine();
            
            System.out.print("Value");
            int value=input.nextInt();
            input.nextLine();
            System.out.println();
            mapset.put(name,value);
        }
        System.out.println(mapset);
    }
}
