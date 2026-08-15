public class constructor_class {
    String name;
    int age;
    int id;
    String grade;
    //making constructor
    constructor_class(String name,int age,int id,String grade){
        this.name=name;
        this.age=age;
        this.id=id;
        this.grade=grade;
    }
    void displayinfo(){
        System.out.println("Name is "+name);
        System.err.println("Age is "+age);
        System.out.println("Id is "+id);
        System.out.println("Grade is "+grade);
    }   
}
