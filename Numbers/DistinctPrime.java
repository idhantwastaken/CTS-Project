/* Question: 
Write a program to check whether a given number is a distinct prime number or not.
A distinct prime number is a number that is made up of only prime digits 
and each digit appears only once in the number.

For Example:
INPUT:  N = 2357
OUTPUT: 2357 is a distinct prime number.

*/
import java.util.Scanner;
class DistinctPrime {
    boolean isDistinctPrime(int n) {
        String str = Integer.toString(n);
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '2' && ch != '3' && ch != '5' && ch != '7')
                return false;
            if (str.indexOf(ch) != str.lastIndexOf(ch))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        DistinctPrime ob = new DistinctPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        if (ob.isDistinctPrime(n)) {
            System.out.println(n + " is a distinct prime number.");
        } else
            System.out.println(n + " is not a distinct prime number.");
    }
}

/*
Algorithm : Distinct Prime Number
1.	Start the Algorithm.
2.	Accept an integer n.
3.	Define a function isDistinctPrime(n) which returns a boolean value.
4.	Convert the number n into a string.
5.	For each character in the string representation of the number:
•	Check whether the digit is one of 2, 3, 5 or 7.
•	If not, return false.
•	Check whether the digit appears more than once in the number.
•	If it appears more than once, return false.
6.	If all digits are prime digits and no digit is repeated, return true.
7.	Call the function isDistinctPrime(n) in the main part of the algorithm.
8.	If the function returns true,
display
“n is a distinct prime number.”
9.	Otherwise,
display
“n is not a distinct prime number.”
10.	Stop the Algorithm.

*/
