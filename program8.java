import java.io.*;
public class program8 {
    public enum DayOfWeek
    {
        MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSEDAY(4),FRIDAY(5),SATURDAY(6),SUDAY(7);
        public int val;
        DayOfWeek(int val)
        {
            this.val=val;
        }
        boolean isWorkDay()
        {
            if(val<6)
            return true;
            else
            return false;
        }
        }
        
        public static void main (String[] args) {
            DayOfWeek Day;
            System.out.println("verification of sunday(WorkDay()");
            System.out.println("DayOfWeek SUNDAY isWorkDay()");
            System.out.println("verification of wednesday(isWorkDay()");
            System.out.println(DayOfWeek.WEDNESDAY.isWorkDay());
        }
    }

