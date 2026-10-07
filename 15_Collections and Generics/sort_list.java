/* Write a program that sorts a list of
String objects in descending order using a custom Comparator. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator;
public class sort_list {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("beer");
        list.add("ant");
        list.add("zoo");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }    
}
