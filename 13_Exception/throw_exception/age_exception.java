
public class age_exception {  
    public static void main(String[] args) {
        int age=45;
        try{
            if(age<60){
                throw new ArithmeticException("YOu are senior citizen");
            }
        }
        catch(ArithmeticException exp){
            System.out.println(exp.getMessage());
        }
    }
}
