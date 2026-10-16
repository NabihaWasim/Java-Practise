
public class Print_Runnable implements Runnable {
    @Override 
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println(i+" "+targetchar);
        }
    }
    private final char targetchar;
    public  Print_Runnable(char targetchar){
        this.targetchar=targetchar;
    }
}
