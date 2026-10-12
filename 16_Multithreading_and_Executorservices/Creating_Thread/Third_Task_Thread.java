package Creating_Thread;

public class Third_Task_Thread extends Thread {
    @Override 
    public void run(){
        System.out.println("Task 3 of #:");
        for(int i=1;i<=10;i++){
            System.out.print(i+"#"+" ");
        }
    }
}
