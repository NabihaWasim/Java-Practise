package Creating_Thread;

public class Runnable_Thread_Priority {
    public static void main(String[] args) {
         Runnable_Thread p1=new Runnable_Thread('*');
         Runnable_Thread p2=new Runnable_Thread('#');
         Thread t1=new Thread(p1);
         Thread t2=new Thread(p2);
         t1.setPriority(Thread.MAX_PRIORITY);

         t1.start();
         t2.setPriority(1);
         t2.start();

    }
    
}
