/*Write a program that uses an executor service to execute multiple
Callable tasks. Each task should calculate and return the 
factorial of a number provided to it. Use Future objects to 
receive the results of the calculations. After all tasks are 
submitted, retrieve the results from the futures, print them, 
and ensure the executor service is shut down correctly. */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Code7 implements  Callable<Integer>{
    private final int Number;
    public Code7(int Number){
        this.Number=Number;
    }
    @Override 
    public Integer call() throws Exception{
        
        int fact=1;
        for(int i=1;i<=Number;i++){
            fact=fact*i;
        }
        return  fact;
    }
    public static void main(String[] args) throws InterruptedException ,ExecutionException{
        ExecutorService service=Executors.newFixedThreadPool(1);
        Code7 numb1=new Code7(3);
        Code7 numb2=new Code7(4);
        Code7 numb3=new Code7(5);
        Future<Integer> task1=service.submit(numb1);
        Future<Integer> task2=service.submit(numb2);
        Future<Integer> task3=service.submit(numb3);
        System.out.println("factorail :"+ task1.get());
        System.out.println("factorail :"+task2.get());
        System.out.println("factorail :"+task3.get());
        service.shutdown();
    }
}
