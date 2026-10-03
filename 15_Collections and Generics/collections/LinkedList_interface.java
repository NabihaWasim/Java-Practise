import java.util.LinkedList;
public class LinkedList_interface {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(56);
        list.add(34);
        list.add(23);
        list.add(89);
        list.add(12);
        list.add(90);
        for (int i:list){
            System.err.println(i);
        }
        System.out.println("operations");
        list.addFirst(45);
        list.addLast(800);
        System.out.println();
        for (int i:list){
            System.err.println(i);
        }
        list.remove(0);
        for (int i:list){
            System.err.println(i);
        }

        list.clear();
        for (int i:list){
            System.err.println(i);
        }
    }
}
