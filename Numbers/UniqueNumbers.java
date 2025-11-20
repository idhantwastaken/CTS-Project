/*
Unique-digits integers in a range

A unique-digit integer is a positive integer (without leading zeros) 
with no duplicate digits. 
For example 7, 135, 214 are all unique-digit integers 
whereas 33, 3121, 300 are not.

Given two positive integers m and n, write a program to determine how 
many unique-digit integers are there in the range between m and n 
(both inclusive) and output them.

The input contains two positive integers m and n. 
Assume m < 30000 and n < 30000. You are to output the number of 
unique-digit integers in the specified range along with their values 
in the format specified below:

SAMPLE DATA:

INPUT:  m = 100
n  = 120
OUTPUT: THE UNIQUE-DIGIT INTEGERS ARE:-
102, 103, 104, 105, 106, 107, 108, 109, 120.
FREQUENCY OF UNIQUE-DIGIT IN INTEGERS IS : 9

INPUT:  m  =  2500
n  =  2550
OUTPUT: THE UNIQUE-DIGIT INTEGERS ARE:-
2501, 2503, 2504, 2506, 2507, 2508, 2509, 2510, 2513, 2514, 2516, 2517, 2518, 2519, 2530, 2531, 2534, 2536, 2537, 2538, 2539, 2540, 2541, 2543, 2546, 2547, 2548, 2549.
FREQUENCY OF UNIQUE-DIGIT INTEGERS IS : 28
*/
import java.util.*;
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
                if(m < 30000 && n < 30000 && m > 0 && n > 0){
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
                else System.out.println("Invalid Input");
                sc.close();
        }
}