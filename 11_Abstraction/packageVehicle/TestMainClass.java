package packageVehicle;
public class TestMainClass {
    public static void main(String[] args) {
        CarClass car1=new CarClass("Porche", 4);
        CarClass car2=new CarClass("Lamborghini", 4);
        BikeClass bike1=new BikeClass("Hunter 350",2);
        BikeClass bike2=new BikeClass("Classic 350", 2);
        car1.show();
        car2.show();
        car1.start();
        car2.start();
        bike1.show();
        bike2.show();
        bike1.start();
        bike2.start();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(bike1);
        System.out.println(bike2);
    }   
}
