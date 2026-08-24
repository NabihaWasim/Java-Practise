package packageVehicle;

public class CarClass extends VehicleClass{
    CarClass(String name,int noOfTires){
        super(name, noOfTires);
    }
    @Override
    public void start(){
        System.out.println("Car is started.");
    }
    
    
}
