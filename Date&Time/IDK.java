import java.util.Scanner;

public class IDK
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
        System.out.print("DATE AFTER (N DAYS): ");
        int n = sc.nextInt();
        
        if (d < 1 || d > 366) {
            System.out.println("DAY NUMBER OUT OF RANGE");
            return;
        }
         
        if (n < 1 || n > 100) {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
            return;
        }
        
        String dateStr = Date(d, year);
        
        int nD = d + n;
        int nYear = year;
        boolean leap = leap(year);
        
        if (leap && nD > 366) {
            nYear = nYear + 1;
            nD = nD - 366;
        }
        else if (nD > 365) {
            nYear = nYear + 1;
            nD = nD - 365;
        }
        
        String nDateStr = Date(nD, nYear);
        
        System.out.println();
        System.out.println("DATE: " + dateStr);
        System.out.println("DATE AFTER " + n 
                            + " DAYS: " + nDateStr);
    }
}