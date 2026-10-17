
import java.util.concurrent.Callable;

public class Return_String implements Callable<String> {
    private final String name;
    public Return_String( String name){
        this.name=name;
    }

    @Override 
    public String call()throws Exception{
        System.out.println("Getting name:");
        Thread.sleep(3000);
        return name+"hello.";
    }
}
