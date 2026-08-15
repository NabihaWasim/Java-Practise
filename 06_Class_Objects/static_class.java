public class static_class {
    String name;
    int age;
    static String college="ABC College";
    void setDetails(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayDetails(){
        System.out.println("Name is "+name+" and age is "+age+" college is "+college);
    }

    
}
