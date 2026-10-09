enum day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
    public String getmessage(){
        switch(this){
            case MONDAY:
                return "MON";
            case TUESDAY:
                return "Thurs";
            case WEDNESDAY:
                return "bguyebgedx";
            default:
                return "bhfbh";
        }
    }
}
public class Enum_Loop_Practice {
    public static void main(String[] args) {
        System.out.println(day.THURSDAY.getmessage());
        day.THURSDAY.getmessage();
        for (day i: day.values()) {
            System.out.println(i + " : " + i.getmessage());;
        }
    }
}
