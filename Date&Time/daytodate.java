import java.util.Scanner;

public class daytodate
{
    static public boolean leap(int year){
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            return true;
        }
        else 
            return false;
    }
    
    public static String Date(int dd, int year) {
        int mDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String mNames[] = {"JANUARY", "FEBRUARY", "MARCH", 
                                "APRIL", "MAY", "JUNE", 
                                "JULY", "AUGUST", "SEPTEMBER", 
                                "OCTOBER", "NOVEMBER", "DECEMBER"};
                                
        boolean leap = leap(year);
        
        if (leap) {
            mDays[1] = 29;
        }
        
        int i = 0;
        int daySum = 0;
        for (i = 0; i < mDays.length; i++) {
            daySum += mDays[i];
            if (daySum >= dd) {
                break;
            }
        }
        
        int date = dd + mDays[i] - daySum;
        
        String day= mNames[i]+" "+date+", "+year;
        return day;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER: ");
        int d = sc.nextInt();
        System.out.print("YEAR: ");
        int year = sc.nextInt();
        
        if (d < 1 || d > 366) {
            System.out.println("DAY NUMBER OUT OF RANGE");
            return;
        }
        
        
        String dateStr = Date(d, year);
        
        

        
        System.out.println();
        System.out.println("DATE: " + dateStr);
      
    }
}
