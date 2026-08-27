package packageShape;
public class abstractSquare extends abstractshape {
    private double length;
    private double breadth;
    public abstractSquare(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void setlength(){
        this.length=length;
    }
    public void setbreadth(){
        this.breadth=breadth;
    }
    public double getlength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
    @Override
    public double calculateArea(){
        return length*breadth;
    } 
}
