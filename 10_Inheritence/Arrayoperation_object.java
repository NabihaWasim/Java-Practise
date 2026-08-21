public class Arrayoperation_object {
    public static void main(String[] args) {
        ArrayOperations_class obj=new ArrayOperations_class(new int[]{1,2,3,4,5});
        ArrayOperations_class.statistics stat=obj.new statistics();
        System.out.println(stat.mean());

    }
    
}
