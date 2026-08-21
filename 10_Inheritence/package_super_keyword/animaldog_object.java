package package_super_keyword;
public class animaldog_object {
    public static void main(String[] args) {
        dog_super d1=new dog_super("Gidget",5 , "Shitzu");
        dog_super d2=new dog_super("Ted", 8, "Pitbull");
        d1.age_dog();
        d2.age_dog();
        d1.sound();
        d2.sound();
        d1.parent_sound();
        d2.parent_sound();
        
    }
    
}
