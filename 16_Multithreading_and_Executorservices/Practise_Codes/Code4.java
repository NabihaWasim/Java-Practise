/*Simulate a traffic signal using threads. Create three 
threads representing three signals: RED, YELLOW, and GREEN. 
Each signal should be on for a certain time, then switch to the 
next signal in order. Use sleep for timing and synchronize 
to make sure only one signal is active at a time. */

public class Code4  extends Thread{
    private final String signal;
    public Code4(String signal){
        this.signal=signal;
    }
    @Override 
    public synchronized void run(){
        System.out.println("Signal is:"+signal);
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Code4 t1=new Code4("RED");
        Code4 t2=new Code4("YELLOW");
        Code4 t3=new Code4("GREEN");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();   
    }
}
