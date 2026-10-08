import java.util.HashMap;
import java.util.Map;
public class check_ifContains {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ravi Gupta", 100);
        map.put("Akash Gupta",67);
        map.put("Bhuvan Bam",99);
        map.put("Abhishek Upmanyu",78);
        System.out.println(map);
        if(map.containsKey("Ravi Gupta")){
            System.out.println("True");
        }else{
            System.out.println("Sorry");
        }
        map.remove("Bhuvan Bam");
        System.out.println(map);
    } 
}
