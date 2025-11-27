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
        int l = (int)Math.log10(n) + 1;
        int ar[] = new int[l];
        if (k.length() != l) {
            System.out.println("Invalid Key!");
            return;
        }
        
        for(int i = l - 1; i > -1; i--) {
            char c = k.charAt(i);
            int d = Integer.valueOf(c) - 48;
            
            if (k.indexOf(c) != k.lastIndexOf(c) && d > l){
                System.out.println("Invalid Key!");
                return;
            }
            
            ar[d - 1] = n % 10;
            n /= 10;
            k = k.substring(0, i);
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
    }
}