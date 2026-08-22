public class innerclass_Car {
    String color="black";
    int id=324;
    public class Engine{
        void showcolor(){
            System.out.println(color);
        }
        void showid(){
            System.out.println(id);
        }
    }
    public static void main(String[] args) {
        innerclass_Car c1=new innerclass_Car();
        innerclass_Car.Engine e1=c1.new Engine();
        e1.showcolor();
        e1.showid();
    }
    
}
