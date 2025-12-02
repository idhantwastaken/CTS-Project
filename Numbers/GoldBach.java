/* Question:
A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.
All even integer numbers greater than 4 are Goldbach numbers.
Write a program to accept an even integer ‘N’ where N > 9 and N < 50. 
Find all the odd prime pairs whose sum is equal to the number ‘N’.

For Example:
INPUT: N = 26
OuTPUT: 26 : 3 + 23
        26 : 7 + 19
        26 : 13 + 13
*/
import java.util.Scanner;
public class GoldBach {
    boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    
    void isGoldBach(int n) {
        int p1, p2 = 0;
        for (p1 = 3; p1 <= n / 2; p1++) {
            if (isPrime(p1)) p2 = n - p1;
            if (isPrime(p2) && isPrime(p1))
                System.out.println(n + " : " + p1 + " + " + p2);
        }
    }

    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        GoldBach ob = new GoldBach();

        System.out.print("Enter an integer:");
        int a = sc.nextInt();

        if (a > 9 && a < 50 && a % 2 == 0)
            ob.isGoldBach(a);
        else
            System.out.println(a + " is not GoldBach.");
    }
}

/*
Algorithm : Goldbach Number
1.	Start the Algorithm.
2.	Accept an integer n.
3.	If n is not even or n < 10 or n > 50,
display
“n is not GoldBach.”
and stop the algorithm.
4.	Define a function isPrime(n) which returns a boolean value.
•	For values from 2 to n / 2:
•	If n is divisible by any value, return false.
•	If no divisor is found, return true.
5.	Define a function isGoldBach(n) to display all possible Goldbach pairs.
•	For each value p1 from 3 to n / 2:
•	If p1 is prime:
•	Compute p2 = n − p1.
•	If both p1 and p2 are prime:
•	Display
n : p1 + p2
6.	Call the function isGoldBach(n).
7.	Stop the Algorithm.

*/
