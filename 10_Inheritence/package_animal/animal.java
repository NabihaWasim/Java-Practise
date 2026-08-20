package package_animal;
public class animal{
    String name;
    int age;
    public animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
    void eat(){
        System.out.println("Animal "+name+" is eating.");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    
}

