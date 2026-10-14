package Synchronize_Keyword;


public class Counter_main  {
    public static void main(String[] args) throws InterruptedException{
       
        Counter_Class counter=new Counter_Class();
        Counter_Thread t1=new Counter_Thread(counter);
        Counter_Thread t2=new Counter_Thread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getcount());
    



    }
    
}
