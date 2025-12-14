//Purpose: Declares an enumerated type.
import java.util.*;
enum Day{
    MONNDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumExample {
    public static void main(String[] args){
        Day today = Day.WEDNESDAY;
        System.out.println("Today is : "+today);
    }
}
