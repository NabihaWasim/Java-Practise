
/*Use the Collections class to count the frequency of 
a particular element in an ArrayList.*/

import java.util.Collections;
import java.util.ArrayList;
public class count_frequency {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(56);
        list.add(56);
        list.add(45);
        list.add(45);
        list.add(100);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int count=Collections.frequency(list, 45);
        System.out.println(count);
    }
}
