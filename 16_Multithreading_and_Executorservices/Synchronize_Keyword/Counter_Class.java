package Synchronize_Keyword;

public class Counter_Class {
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public int getcount(){
        return count;
    }
}
