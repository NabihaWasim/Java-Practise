//method overloaing unsing sum method with different parameters.
public class method_overloading{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public String sum(String a,String b){
        return a+b;
    }
    public static void main(String[] args) {
        method_overloading m=new method_overloading();
        System.out.println(m.sum(1,2));
        System.out.println(m.sum("na","sh"));
        System.out.println(m.sum(341.5467,345.56));
    }
}