package Creating_Thread;

public class Second_Task_Thread extends Thread {
    @Override 
    public void run(){
        System.out.println("Task 2 of $:");
        for(int i=1;i<=10;i++){
            System.out.print(i+"$"+" ");
        }
    }
}
