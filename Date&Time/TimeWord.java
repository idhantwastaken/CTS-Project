import java.util.Scanner;
public class TimeWord
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Time:-");
        System.out.println("Hour:-");
        int hour=sc.nextInt();
        System.out.println("Minute:-");
        int min= sc.nextInt();
        if((hour>12 && hour<1) && (min>59 && min<0)){
            System.out.println("Out of Range ");
            System.exit(0);
        }
        String no[]={"" ,"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty-One", "Twenty-Two", "Twenty-Three", "Twenty-Four", "Twenty-Five", "Twenty-Six", "Twenty-Seven", "Twenty-Eight", "Twenty-Nine"};
        int nexthour= (hour==12)?1: hour+1;
        System.out.println("Output:-");
        if(min==0){
            System.out.println(no[hour]+" o' clock");
        }
        else if(min==15){
            System.out.println("Quarter past "+no[hour]);
        }
        else if(min==30){
            System.out.println("Half past "+no[hour]);
        }
        else if(min==45){
            System.out.println("Quarter to "+no[nexthour]);
        }
        else if(min<30){
             System.out.println(no[min]+" minutes past "+no[hour]);
        }
        else{
            System.out.println(no[60-min]+" minutes to "+no[nexthour]);
        }
    }
}
