//Simulate a dice roll using Math.random() 
// and display the outcome (1 to 6).
public class dice_roll {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            int random=(int)(Math.random()*6)+1;
            System.out.print("Number in "+(i+1)+" roll:");
            System.out.println(random+" ");
        } 
    } 
}
