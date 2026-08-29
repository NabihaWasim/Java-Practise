package package_method_overriding;

public class testclass {
    public static void main(String[] args) {
        animal_class animal=new animal_class();
        animal_class cat=new cat_class();
        animal_class dog=new dog_class();
        cat.sound();
        dog.sound();
        animal.sound();
        cat.eat();
        dog.eat();
    }
    
}
