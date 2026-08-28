package interface_flyable;
public class eagle_class extends bird_class{
    public eagle_class(String name,String breed){
        super(name,breed);
    }
    
    @Override
    public void  fly(){
        System.out.println("eagle "+getname()+" is flying,breed:"+getbreed());
    }


    
}
