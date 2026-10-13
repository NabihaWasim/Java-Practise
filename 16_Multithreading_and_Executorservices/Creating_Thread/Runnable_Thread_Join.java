package Creating_Thread;

public class Runnable_Thread_Join {
    public static void main(String[] args) throws InterruptedException{
         Runnable_Thread p1=new Runnable_Thread('*');
         Runnable_Thread p2=new Runnable_Thread('#');
         Thread t1=new Thread(p1);
         Thread t2=new Thread(p2);
         t1.start();
         t1.join();
         t2.start();
         t2.join();
    }   
}
