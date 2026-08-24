package packageVehicle;
public abstract class VehicleClass {
   public String name;
   private int noOfTires;
   public VehicleClass(String name,int noOfTires){
    this.name=name;
    this.noOfTires=noOfTires;
   }
   public int getnoOfTires(){
    return noOfTires;
   }
   public void show(){
    System.out.println(noOfTires);
   }
   public abstract void start();
   @Override
    public String toString() {
            return "Vehicle Name: " + name +
            ", Number of Tires: " + noOfTires;
    }

    
}
