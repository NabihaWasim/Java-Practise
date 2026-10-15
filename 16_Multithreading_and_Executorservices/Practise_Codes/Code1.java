/*Write a program that creates two threads. Each thread should 
print "Hello from Thread X", where X is the number of the 
thread (1 or 2), ten times, then terminate. */

public class Code1 extends Thread {
    @Override 
    public void run(){
        for (int i=1;i<11;i++){
            System.out.println("Hello from thread "+Thread.currentThread().getName());
        }
    }
    public Code1(String name){
        super(name);
    }

    public static void main(String[] args) {
        Code1 c1=new Code1("Thread-1");
        Code1 c2=new Code1("Thread-2");
        c1.start();
        c2.start();
    }
}
