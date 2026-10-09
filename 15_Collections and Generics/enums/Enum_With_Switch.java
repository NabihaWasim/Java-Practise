enum order{
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELED;
    public String getMessage(){
        switch(this){
            case PLACED:
                return "order placed";
               
            case SHIPPED:
                return "order shipped";
            case DELIVERED:
                return "order delivered";
            case CANCELED:
                return "order canceled";   
            default:
                return "hkbeubhgefgjbhf";         
        }
    }
}
public class Enum_With_Switch {
    public static void main(String[] args) {
        System.out.println(order.PLACED.getMessage());
    }
}
