
public class print_num {
    public static void print(int... numbers){
        for(int i:numbers){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Numbers are:");
        print(1,2,3,4,5,6,7);
        System.out.println();
        print(100);
        print();
    } 
}
