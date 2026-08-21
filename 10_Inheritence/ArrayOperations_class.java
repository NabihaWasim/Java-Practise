/* Create a class ArrayOperations with a static nested class Statistics.
Statistics could have methods like mean(), median(), 
which operate on an array.*/
public class ArrayOperations_class {
    private int[] arr;
    public ArrayOperations_class(int[] arr){
        this.arr=arr;
    }
    public class statistics{
        double mean(){
            double sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            return sum/arr.length;
        }
    }  
}
