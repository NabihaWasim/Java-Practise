public class even_num {
    public static int evenNum(int... numbers){
        int count=0;
        for(int i:numbers){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("NUMBER OF EVEN NUMBERS IN ARRAY ARE:");
        int res=evenNum(34,23,354,76);
        System.out.println(res);
        System.out.println(evenNum(45,88));
    }
}
