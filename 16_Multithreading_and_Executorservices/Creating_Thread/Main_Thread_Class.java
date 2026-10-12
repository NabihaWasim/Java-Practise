package Creating_Thread;

public class Main_Thread_Class {
    public static void main(String[] args) {
        First_Task_Thread t1=new First_Task_Thread();
        Second_Task_Thread t2=new Second_Task_Thread();
        Third_Task_Thread t3=new Third_Task_Thread();
        System.out.println("thread 1*");
        
        t1.start();
        System.out.println("Thread 2$");
        t2.start();
        System.out.println("Thread 3#");
    }
}
