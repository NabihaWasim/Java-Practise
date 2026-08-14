public class officeobject_this {
    public static void main(String[] args) {  
        officeclass_this employee1=new officeclass_this();
        officeclass_this employee2=new officeclass_this();
        officeclass_this employee3=new officeclass_this();
        employee1.setdetails("Enola holmes",23454,56000,34); 
        employee2.setdetails("Sherlock Holmes",23453,34000, 8);
        employee3.setdetails("Mykroft Holmes",3456,67000, 23);
        employee1.displaydetails();
        System.out.println();
        employee2.displaydetails();
        System.out.println();
        employee3.displaydetails();
        System.out.println();
        employee2.givebonus();
        employee1.floor_no();
        employee3.givebonus();
    }   
}

