public class Function {
    public static void main(String[] args) {
        greeting();
        int x=10;int y=20;
        add(x,y);
    }       
        public static void greeting(){
            System.out.println("Welcome to java");
        }
        public static int add(int x,int y){
            int sum;
            sum=x+y;
            System.out.println("Sum is "+sum);
            return sum;
        }
}
