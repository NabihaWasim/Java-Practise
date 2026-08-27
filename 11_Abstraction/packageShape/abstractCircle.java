package packageShape;
public class abstractCircle extends abstractshape{
    private double radiusincms;
    public abstractCircle(double radiusincms){
        this.radiusincms=radiusincms;
    }
    public void setradiusincms(){
        this.radiusincms=radiusincms;
    }
    public double getradiusincms(){
        return radiusincms;
    }
    @Override
    public  double calculateArea(){
        return Math.PI*Math.pow(radiusincms,2);
    }
}
