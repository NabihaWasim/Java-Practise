public class typesOfException {
    public static void main(String[] args) {
        try{
            int arr[]={23,567,12};
            System.out.println("value is :"+arr[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Maths error occured:"+e.getMessage());
        }
        catch(IndexOutOfBoundsException a){
            System.out.println("Array type error:"+a.getMessage());
        }
        }
    }
    

