/*Write a program that creates a single-threaded executor 
service. Define and submit a simple Runnable task that 
prints numbers from 1 to 10. After submission, shut down 
the executor. */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Code5 implements Runnable {
    @Override 
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ExecutorService service=Executors.newSingleThreadExecutor();
        Code5 task1=new Code5();
        service.submit(task1);
        service.shutdown();  
    }
}
