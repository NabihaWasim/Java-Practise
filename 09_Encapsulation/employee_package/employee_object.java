package employee_package;

public class employee_object {
    public static void main(String[] args) {
        employee_class emp1=new employee_class("Jane Harding",45,50000 );
        employee_class emp2=new employee_class("Judy Anne",43 ,45000 );
        emp1.display_details();
        emp2.display_details();
    }
}
