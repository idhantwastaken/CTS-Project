/* Question:
Given two positive integers m and n, write a program to determine how 
many unique-digit integers are there in the range between m and n 
and print them. A unique-digit integer is a positive integer with no duplicate digits. 
For example, 123 and 59 are unique-digit integers, while 121 and 455 are not.

For Example:
INPUT:  m = 100 n  = 120
OUTPUT: THE UNIQUE-DIGIT INTEGERS ARE:-
102, 103, 104, 105, 106, 107, 108, 109, 120.
FREQUENCY OF UNIQUE-DIGIT IN INTEGERS IS : 9
*/
import java.util.Scanner;
class UniqueNumbers{
        boolean isUniqueNumber(int a){
                boolean digits[] = new boolean[10];
                while(a > 0){
                        int d = a%10;
                        if(digits[d] == true) return false;
                        else digits[d] = true;
                        a = a/10;
                }
                return true;
        }
        
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                UniqueNumbers ob = new UniqueNumbers();
                System.out.print("Enter the range.");
                int m = sc.nextInt();
                int n = sc.nextInt();
                String output="";
                int count = 0;
                System.out.println("The Unique Digit Integers are:-");                        
                for(int i =m; i <= n; i++){
                        if(ob.isUniqueNumber(i)){
                                output+=i+", ";
                                count++;
                        }
                }
                output=output.substring(0,output.length()-2) + ".";
                System.out.println(output);
                
                System.out.println("FREQUENCY OF UNIQUE-DIGIT INTEGERS IS :"+count);
        }
}