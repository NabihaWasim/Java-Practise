package Creating_Thread;

public class Runnable_Thread implements Runnable {
    @Override 
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i+":"+targetchar);
        }
        System.out.println(Thread.currentThread().getName());
    }
    private final char targetchar;
    public Runnable_Thread(char targetchar){
        this.targetchar=targetchar;
    }

    
}
