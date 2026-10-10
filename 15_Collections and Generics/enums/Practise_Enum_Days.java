/*Create an enum called Day that represents the days of the week.
Write a program that prints out all the days
of the week from this enum. */

enum days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,
    SUNDAY;
}
public class Practise_Enum_Days{
    public static void main(String[] args) {
        for(days i:days.values()){
            System.out.println(i);
        }
    }
}