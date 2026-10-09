/*Create a PriorityQueue of a custom class Student with attributes 
name and grade. Use a comparator to order by grade. */

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
class Student{
    private String name;
    private int grade;
    Student(String name,int grade){
        this.name=name;
        this.grade=grade;
    }
    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(){
        this.grade=grade;
    }
    @Override 
    public String toString(){
        return name+"-"+grade;
    }
}
public class comparator_priorityqueue {
    public static void main(String[] args) {
        Comparator<Student> compare=(s1,s2)->s1.getGrade()-s2.getGrade();
        PriorityQueue<Student> students=new PriorityQueue<>(compare);
        students.add(new Student("mahi", 45));
        students.add(new Student("utsav", 34));
        students.add(new Student("shubh", 90));
        System.out.println(students);
        while(!students.isEmpty()){
            Student s =students.poll();
            System.out.println(s.getName()+"-"+s.getGrade());
        }
    }
}
