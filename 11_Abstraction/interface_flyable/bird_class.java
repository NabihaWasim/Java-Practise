package interface_flyable;
public abstract class bird_class implements interface_fly {
    private String name;
    private String breed;
    public bird_class(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setbreed(String breed){
        this.breed=breed;
    }
    public String getbreed(){
        return breed;
    }
}
