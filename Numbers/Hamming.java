/* Question:
Write a program to check whether a given number is a Hamming number or not.
A Hamming number is a positive number whose only prime factors are 2, 3 or 5.

For Example:
INPUT: 30
OUTPUT: 30 = 2^1 * 3^1 * 5^1
        30 is a Hamming number.

*/
import java.util.Scanner;
class Hamming {
    void isHamming(int n) {
        int counter[] = new int[3];
        int temp = n;
        while (n % 2 == 0) {
            counter[0]++;
            n /= 2;
        }
        while (n % 3 == 0) {
            counter[1]++;
            n /= 3;
        }
        while (n % 5 == 0) {
            counter[2]++;
            n /= 5;
        }
        if (n == 1) {
            System.out.println(temp + " = 2^" + counter[0] + " * 3^" + counter[1] + " * 5^" + counter[2]);
            System.out.println(temp + " is a Hamming number.");
        } else
            System.out.println(temp + " is not a Hamming number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hamming ob = new Hamming();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        ob.isHamming(n);
    }
}
