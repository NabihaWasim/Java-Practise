import java.util.ArrayList;
public class Arraylist_interface {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(45);
        number.add(56);
        number.add(433);
        number.add(33);
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }
        System.out.println("methods in array:");
        System.out.println(number.get(1));
        System.out.println(number.get(3));
        System.out.println(number.size());
        System.out.println(number.set(0,21));
        System.out.println();
        System.out.println(number.remove(2));
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }

    }
}
