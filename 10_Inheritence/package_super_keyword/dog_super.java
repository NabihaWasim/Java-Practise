package package_super_keyword;
public class dog_super extends animal_super {
    dog_super(String name,int age,String breed){
        super(name,age,breed);
    }
    @Override
    void sound(){
        System.out.println(name+" bars vey loud because of "+breed+" breed");
    }  
    int age_dog(){
        System.out.println(name+" is "+age+" years old.");
        return age;
    }
    void parent_sound(){
        super.sound();
    }

}
