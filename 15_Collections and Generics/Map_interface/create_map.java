import java.util.Map;
import java.util.HashMap;
public class create_map {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("Ravi Gupta", 100);
        map.put("Akash Gupta",67);
        map.put("Bhuvan Bam",99);
        map.put("Abhishek Upmanyu",78);
        System.out.println(map);
        System.out.println("Ravi Gupta has value of "+map.get("Ravi Gupta"));
    } 
}
