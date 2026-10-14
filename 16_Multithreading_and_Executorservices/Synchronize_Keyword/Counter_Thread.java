package Synchronize_Keyword;

public class Counter_Thread extends Thread{
    private Counter_Class counter;
    public Counter_Thread(Counter_Class counter){
        this.counter=counter;
    }
    @Override 
    public void run(){
        
        for(int i=1;i<=10;i++){
            System.out.println(i);
            counter.increment();
        }

    }
}
