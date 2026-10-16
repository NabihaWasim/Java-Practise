import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Print_RunnableMain {
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(2);
        Print_Runnable task1=new Print_Runnable('#');
        Print_Runnable task2=new Print_Runnable('$');
        Print_Runnable task3=new Print_Runnable('%');
        service.submit(task1);
        service.submit(task3);
        service.submit(task2);
        service.shutdown();
    }
    
}
