/*Enhance the Day enum by adding an attribute that indicates 
whether it is a weekday or weekend. Add a method in the 
enum that returns whether it's a weekday or weekend, and 
write a program to print out each day along with its type. */

enum days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,
    SUNDAY;

    public String getMessage(){
        switch(this){
            case MONDAY:
                return "Weekday";
            case TUESDAY:
                return "Weekday";
            case WEDNESDAY:
                return "Weekday";
            case THURSDAY:
                return "Weekday";
            case FRIDAY:
                return "Weekday";
            case SATURDAY:
                return "Weekend";
            case SUNDAY:
                return "Weekend";     
            default:
                return "These are days";                       
        }
    }
}
public class Practise_Enum_Weekends {
    public static void main(String[] args) {
        for(days i: days.values()){
            System.out.println(i+":"+i.getMessage());
        }
    } 
}
