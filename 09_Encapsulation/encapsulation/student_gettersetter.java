package encapsulation;
public class student_gettersetter {
    private String name;
    private int age;
    private int id;
    private String house;
    public student_gettersetter(String name,int age,int id,String house){
        this.name=name;
        this.id=id;
        this.age=age;
        this.house=house;  
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        if(age<0 || age>100){
            System.out.println("Invalid age.");
        }else{
            this.age=age;
        }
    }
    public int getage(){
        return age;
    }
    @Override
    public String toString(){
        return name+" "+age+" "+id+" "+house;
    }
    public static void main(String[] args) {
        student_gettersetter s1=new student_gettersetter("Enola",34, 3456,"Liberty");
        System.out.println(s1);
        s1.setname("Nabiha");
        s1.setage(456);
        System.out.println(s1.getage());
        System.out.println(s1.getname());
    }  
}
