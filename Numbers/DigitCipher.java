/* Question: 
A Digit Permutation Cipher is a form of number encryption where the digits of a
number are rearranged based on a given key where 1 ≤ key ≤ size of the number. 
The key is a sequence of integers that defines the new positions of the digits.

Write a program to enter a number and a key, encrypt the number by permuting its 
digits according to the key and return the ciphered number.

For example:
INPUT:  N   = 25314
        Key = 31425
OUTPUT: Ciphered number: 32514
*/
import java.util.Scanner;
class DigitCipher {
    int n; String k;
    
    void cipher() {
        int l = (int)(Math.log10(n)) + 1;
        int ar[] = new int[l];
        if (k.length() != l) {
            System.out.println("Invalid Key!");
            return;
        }
        
        for(int i = l - 1; i > -1; i--) {
            char c = k.charAt(i);
            int d = Integer.valueOf(c) - 48;
            
            if (k.indexOf(c) != k.lastIndexOf(c) || d > l){
                System.out.println("Invalid Key!");
                return;
            }
            
            ar[d - 1] = n % 10;
            n /= 10;
        }
        
        System.out.print("Ciphered number: ");
        for(int i = 0; i < ar.length; i++)
            System.out.print(ar[i]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitCipher dc = new DigitCipher();
        
        System.out.println("Enter a number:");
        dc.n = sc.nextInt();
        System.out.println("Enter key:");
        int k = sc.nextInt();
        dc.k = Integer.toString(k);
        dc.cipher();
    }
}

/*
Algorithm : Digit Cipher
1.	Start the Algorithm.
2.	Accept an integer n.
3.	Accept an integer k representing the key and store it as a string.
4.	Determine the number of digits l in the number n.
5.	If the length of the key is not equal to l,
display “Invalid Key!” and stop the algorithm.
6.	Create an integer array ar of size l.
7.	Define a function cipher() to generate the ciphered number.
•	For each index i from l − 1 down to 0:
•	Extract the character at position i from the key.
•	Convert the character into its integer value d.
•	If the digit d is repeated in the key or d is greater than l:
•	Display “Invalid Key!” and stop the algorithm.
•	Assign the last digit of n to ar[d − 1].
•	Remove the last digit from n.
8.	Display the message “Ciphered number:”.
9.	Traverse through the array ar from index 0 to l − 1 and print each element.
10.	Stop the Algorithm.

*/
