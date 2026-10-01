public class max_number {
    public static int maxNum(int... number){
        int max=0;
        for(int i:number){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int result1 =maxNum(34,67,9,34,56,68);
        int result2 =maxNum(34,400,9,34,56,68);
        System.out.println(result1);
        System.out.println(result2);
    }
    
}
