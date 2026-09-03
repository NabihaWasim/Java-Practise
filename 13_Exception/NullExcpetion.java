public class NullExcpetion {
    public static void main(String[] args) {
        String name=null;
        try{
            System.out.println(name.length());
            System.out.println(name);
        }
        catch(NullPointerException e){
            System.out.println("Your name is null");
            System.out.println(e.getMessage());
        }
        System.out.println("Exception handled");
    }
}
