/*
Write a program to accept the year, month and the weekday of the 1st day of that month and generate its calendar.

For E.g.: Enter year and month: 2025
February
Enter first day of month Saturday
----------------------------------------------------------------
  February 2025
----------------------------------------------------------------
  SUN     MON     TUE     WED     THU     FRI     SAT
----------------------------------------------------------------
                                                  	 1
----------------------------------------------------------------
    2	3	  4	    5	     6	      7	      8
----------------------------------------------------------------
    9	10	11	  12	  13	   14	    15
----------------------------------------------------------------
   16	17	18	  19	  20	   21	    22
----------------------------------------------------------------
   23	24	25	  26	  27	   28
----------------------------------------------------------------
*/
import java.util.Scanner;
public class Calender {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();

        System.out.print("Name of the month:");
        String mon=sc.next().trim();

        System.out.print("1st day of "+mon+":");
        String day=sc.next().trim();

        String mNames[] = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        int dd[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            dd[1]=29;
        }
        String wDays[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        int mdex=-1;
        for(int i=0;i<12; i++){
            if(mNames[i].equalsIgnoreCase(mon)){
                mdex=i;
                break;
            }
        }

        if (mdex == -1) {
            System.out.println("Invalid Month!");
            System.exit(0);
        }

        int wdex=-1;
        for(int i=0;i<7; i++){
            if(wDays[i].equalsIgnoreCase(day)){
                wdex=i;
                break;
            }
        }

        if (wdex == -1) {
            System.out.println("Invalid Weekday!");
            System.exit(0);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println(mNames[mdex] + " " + year);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < wdex; i++) {
            System.out.print("\t");
        }

        for (int d = 1; d <= dd[mdex]; d++) {
            System.out.print(d+"\t");
            if (((d + wdex)%7)== 0) {
                System.out.println();
            }
        }
        System.out.println("\n-----------------------------------------------------------------");
    }
    
}