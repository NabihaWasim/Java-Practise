
/*Create a fixed thread pool with a specified number of threads
using Executors.new FixedThreadPool(int). Submit multiple tasks 
to this executor, where each task should print the current thread's 
name and sleep for a random time between 1 and 5 seconds.
Finally, shut down the executor and handle proper termination using 
awaitTermination.
*/

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Code6 implements Runnable {
    
    private int getrandom(){
        double random=Math.random()*5+1;
        return (int) random;
    }
    @Override 
    public void run() {
        System.out.println("hello i am "+Thread.currentThread().getName());
        try{
           Thread.sleep(getrandom()*1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ExecutorService service =Executors.newFixedThreadPool(3);
        Code6 task1=new Code6();
        Code6 task2=new Code6();
        Code6 task3=new Code6();
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.shutdown();

    }
    
}
