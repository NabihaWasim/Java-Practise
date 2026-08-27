package packageShape;
public class testclass {
    public static void main(String[] args) {
        abstractCircle c=new abstractCircle(245);
        abstractSquare s=new abstractSquare(345, 0435);
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }  
}
