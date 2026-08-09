public class pattern {
    public static void main(String[] args) {
        pattern();
        
    }
    public static void pattern(){
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    
}
