package package_geometry;
public class rectangle {
    private double length;
    private double breadth;
    public rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth; 
    }
    public void setlength(double length){
        this.length=length;
    }
    public void setbreadth(double breadth){
        this.breadth=breadth;
    }
    public double getlength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
}
