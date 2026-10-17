import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Return_StringMain {
    public static void main(String[] args) throws InterruptedException,ExecutionException {
        ExecutorService service=Executors.newFixedThreadPool(2);
        Return_String task1=new Return_String("Bharti");
        Return_String task2=new Return_String("Harsh");
        Return_String task3=new Return_String("Ravi Gupta");
        Return_String task4=new Return_String("Akash");
        Future<String> name1=service.submit(task1);
        Future<String> name2=service.submit(task2);
        Future<String> name3=service.submit(task3);
        Future<String> name4=service.submit(task4);
        System.out.println(name1.get());
        System.out.println(name2.get());
        System.out.println(name3.get());
        System.out.println(name4.get());
    }
}
