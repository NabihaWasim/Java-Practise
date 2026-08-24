package packageVehicle;
public class BikeClass extends VehicleClass {
    public BikeClass(String name,int noOfTires){
        super(name, noOfTires);
    }
    public void start(){
        System.out.println("Bike has started to move.");
    } 
}
