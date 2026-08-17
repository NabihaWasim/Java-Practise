//a Student class with fields like name and age, and use 
// tostring to print student details.
import java.util.Scanner;
public class tostring{
    String name;
    int age;
    int id;
    String House;
    public tostring(String name,int age,int id,String House){
        this.name=name;
        this.age=age;
        this.id=id;
        this.House=House;
    }
    @Override
    public String toString(){
        return "Student info: name"+name
        +" age: "+age+" id: "+id
        +" house: "+House;

    }

    public static void main(String[] args) {
        tostring s1=new tostring("Enola",45,54678,"Liberty");
        System.out.println(s1);
        
    }
}
