/*Question: 
Write a program to check whether a given number is a Keith number or not.
A Keith number is an n-digit number N that appears in a special sequence 
generated from its own digits. The special sequence has first n terms as digits
of x and other terms are recursively evaluated as sum of previous n terms.

For Example:
INPUT:  N = 14
OUTPUT: 14 is a Keith number.
*/
import java.util.Scanner;
class KeithNumber {
    boolean isKeith(int n) {
        int l = (int)Math.log10(n) + 1;
        int seq[] = new int[l];
        int temp = n;
        while (temp > 0) {
            seq[--l] = temp % 10;
            temp = temp / 10;
        }

        int next = 0;
        while(next < n) {
            next = 0;
            for (int i = 0; i < seq.length; i++)
                next += seq[i];
            if (next == n) return true;
            for (int i = 0; i < seq.length - 1; i++)
                seq[i] = seq[i + 1];
            seq[seq.length - 1] = next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KeithNumber ob  = new KeithNumber();
        
        System.out.println("N: ");
        int n = sc.nextInt();
        if(ob.isKeith(n)) {
            System.out.println(n + " is a Keith number.");
        } else System.out.println(n + " is not a Keith number");
    }
}
