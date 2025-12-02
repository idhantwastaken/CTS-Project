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
        if(hour>12){
            System.out.println("Invalid Output");
            System.exit(0);
        }

        if (check.equals("AM")) {
            if (hour == 12) {
                hour = 0;  // 12 AM → 00
            }
        } else { // PM
            if (hour != 12) {
                hour += 12; // Add 12 for 1 PM–11 PM
            }
        }

        System.out.printf("24-hour format: "+hour+":"+stmin+check);
        
    }
}
