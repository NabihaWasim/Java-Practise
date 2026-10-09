enum payment{
    PENDING(401),
    SUCCESS(501),
    FAILED(601);

    private int code;
    payment(int c){
        code=c;
    }
    public String getMessage(){
        return "code:"+code;
    }
}      
public class payment_status {
    public static void main(String[] args) {
        System.out.println(payment.FAILED.getMessage());
        System.out.println(payment.PENDING.getMessage());
    }
}
