/*Create three threads. Ensure that the second thread 
starts only after the first thread ends and the third thread
starts only after the second thread ends using the join 
method. Each thread should print its start and end along with 
its name. */

public class Code3 extends Thread {
    private final char character;
    public  Code3(char character){
        this.character=character;
    }
    @Override 
    public void run(){
        System.out.println("started:"+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println(i+" "+character);
        }
        System.out.println("end:"+Thread.currentThread().getName());
        System.out.println();
    }
    public static void main(String[] args) throws InterruptedException {
        Code3 t1=new Code3('$');
        Code3 t2=new Code3('*');
        Code3 t3=new Code3('#');
        t1.setName("thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
