public class Need_for_Threading{
    public static void main(String[] args) {
        
        System.out.println("Task 1 of *:");
        for(int i=1;i<=10;i++){
            System.out.print(i+"*"+" ");
        }
        System.out.println();
        System.out.println("Task 2 of $:");
        for(int i=1;i<=10;i++){
            System.out.print(i+"$"+" ");
        }
        System.out.println();
        System.out.println("Task 3 of #:");
        for(int i=1;i<=10;i++){
            System.out.print(i+"#"+" ");
        }
        System.out.println();
        float time=System.currentTimeMillis();
        System.out.println("Time taken: "+time);
        
    }
}