/* Question:
Write a program to check whether a given number is a Fascinating number or not.
A fascinating number is a number which when multiplied by 2 and 3, and the
concatenation of the results along with the original number contains all digits from 1 to 9 exactly once.

For Example:
INPUT:  n = 192
OUTPUT: 192 is a Fascinating number.
*/
import java.util.Scanner;
public class Fascinating {
    int num;
    boolean freq[] = new boolean[10];
    Fascinating(int n) { num = n;}
    void extract(int n) {
        while (n > 0) {
            int r = n % 10;
            freq[r] = true;
            n /= 10;
        }
    }
    void isFascinating() {
        extract(num);
        extract(num * 2);
        extract(num * 3);
        for (int i = 1; i <= 9; i++)
            if (!freq[i]) {
                System.out.println(num + " is not fascinating.");
            return;
        }
        System.out.println(num + " is fascinating.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();
        Fascinating ob = new Fascinating(a);
        ob.isFascinating();
    }
}

/*
Algorithm : Fascinating Number
1.	Start the Algorithm.
2.	Accept an integer num.
3.	Create a boolean array freq of size 10 and initialize all elements to false.
4.	Define a function extract(n) to mark the digits present in a number.
•	While n > 0:
•	Find the last digit r by taking remainder when n is divided by 10.
•	Set freq[r] as true.
•	Remove the last digit from n.
5.	Define a function isFascinating() to check whether the number is fascinating.
•	Call the function extract(num).
•	Call the function extract(num × 2).
•	Call the function extract(num × 3).
•	For each digit from 1 to 9:
•	If freq[digit] is false:
•	Display “num is not fascinating.”
•	Stop the function.
•	If all digits from 1 to 9 are present exactly once:
•	Display “num is fascinating.”
6.	Call the function isFascinating().
7.	Stop the Algorithm.

*/
