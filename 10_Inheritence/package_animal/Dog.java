package package_animal;
public class Dog extends animal{
    void bark(){
        System.out.println("Dog is barkimg");
    }
    Dog (String name,int age){
        super(name,age);
    }
    public static void main(String[] args) {
        Dog d1=new Dog("Max",4);
        Dog d2=new Dog("Duke",3);
        System.out.println(d1);
        System.out.println(d2);
        d1.bark();
        d2.eat();
        d1.eat();
    }
}
