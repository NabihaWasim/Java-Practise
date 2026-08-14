public class officeclass_this {
    String name;
    int id;
    float salary;
    int desk_no;
    void setdetails(String name ,int id, float salary,int desk_no){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.desk_no=desk_no;
    }
    void displaydetails(){
        System.out.println("Name:"+name+"\nid:"+id+"\nSalary:"+salary+"\nDesk_no:"+desk_no);
    }
    void givebonus(){
        if(salary>50000){
            float bonus=salary*0.10f;
            float newsalary=salary+bonus;
            System.out.println("Your salary:"+salary+" is now "+newsalary);
        }
        else{
            System.out.println("NO bonus still your salary is "+salary);
        }
    }
    void floor_no(){
        if(desk_no>10){
            System.out.println("Employee is from first floor.");
        }else{
            System.out.println("Employee belongs to ground floor.");
        }
    }
    

    
}
