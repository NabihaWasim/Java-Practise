package package_calculate;
import package_geometry.circle;
import package_geometry.rectangle;

public class calculate_area {
    public double circle_area(circle c){
        return Math.PI*c.getradius()*c.getradius();
    }
    public double rectangle_area(rectangle r){
        return r.getlength()*r.getbreadth();
    }
    public static void main(String[] args) {
        circle c=new circle(3456);
        rectangle r=new rectangle(34,67);
        calculate_area cal=new calculate_area();
        System.out.println("Circle area:"+cal.circle_area(c));
        System.out.println("Rectangle are: "+cal.rectangle_area(r));
        c.setradius(1);
        r.setbreadth(46);
        System.out.println("new Circle area: "+cal.circle_area(c));
        System.out.println("new Rectangle are: "+cal.rectangle_area(r));

    }
    
}
