/*Write a program that starts a thread and prints its state 
after each significant event (creation, starting, and termination). 
Use Thread.sleep() to simulate long-running tasks and Thread.getState()
to print the thread's state. */

public class Code2 extends Thread {
    @Override 
    public void run(){
        System.out.println("Hello");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Code2 t1=new Code2();
        //Created NEW thread
        System.out.println(t1.getState());
        //Thread into RUNNABLE state
        t1.start();
        System.out.println(t1.getState());
        //Thread inthe waiting stage.
        t1.interrupt();
        t1.join();
        //Thread is terminated.
        System.out.println(t1.getState());
    }
}
