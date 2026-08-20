/*Define a class Employee with private attributes (like name, age, and salary), 
public methods to get and set these attributes, and a package-private method 
to displayEmployeeDetails. Create another class 
in the same package to test access to the displayEmployeeDetails method. */
package employee_package;
public class employee_class {
    private String name;
    private int age;
    private double salary;
    public employee_class(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    //public set methods to access private attributes
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    //public get methods to access private attributes
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public double getsalary(){
        return salary;
    }
    //package-private method to displayEmployeeDetails
    void display_details(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
    }  
}
