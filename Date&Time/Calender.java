import java.util.Scanner;
public class Calender
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();

        System.out.println("Name of the month:");
        String mon=sc.next().trim();

        System.out.println("1st day of "+mon+":");
        String day=sc.next().trim();

        String mNames[] = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        int dd[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(leap(year)){
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

    
    static public boolean leap(int year){
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            return true;
        }
        else 
            return false;
    }
}
