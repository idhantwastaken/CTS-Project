/*Question:
Write a program which converts time from 12-hour format to 24-hour format.

For example:
Input: 02:30 PM
Output: 14:30
*/
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in 12-hour format (HH:MM AM/PM): ");
        String input = sc.nextLine().trim();

        String check=input.substring(6);
        String sthour= input.substring(0,2);
        String stmin=input.substring(3,5);
        int hour = Integer.parseInt(sthour);
        int min = Integer.parseInt(stmin);

        if(hour>12 || hour<1 || min>59 || min<0){
            System.out.println("Invalid Input!");
            System.exit(0);
        }

        if (check.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else { // PM
            if (hour != 12) {
                hour += 12; // Add 12 for 1 PM–11 PM
            }
        }

        System.out.printf("24-hour format: "+hour+":"+stmin); 
    }
}
