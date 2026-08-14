//objects using student class
public class studentobject {
    public static void main(String[] args) {
        studentClass student1=new studentClass();
        student1.name="Harvey";
        student1.age=23;
        student1.fees=34345;
        studentClass student2=new studentClass();
        student2.name="Enola Holmes";
        student2.age=25;
        student1.displayage();
        student2.displayage();
        student1.displayfees();
        student1.study();  
    }  
}
