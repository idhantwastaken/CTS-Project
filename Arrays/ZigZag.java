/*Question:
Write a program to rearrange the elements of an array of size N (2 <= N <= 10) such
that the elements are in the following order: a < b > c < d > e < f. 

For example: 
INPUT: N: 7
       Array elements: 4 3 7 8 6 2 1
OUTPUT: Original Array: 4 3 7 8 6 2 1
        Zig-Zag Array: 3 7 4 8 2 6
 
*/
import java.util.Scanner;
class ZigZag {
    int n, A[];
    static Scanner sc = new Scanner(System.in);
    
    ZigZag(int size) {
        n = size;
        A = new int[n];
    }
    
    void input() {
        System.out.print("Array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            if(A[i] < 0) {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
        }
    }
    
    void zigzag() {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            } else {
                if (A[i] < A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            }
        }
        System.out.print("\nZig-Zag Array:");
        for (int i : A)
            System.out.print(i + " ");
    }
    
    public static void main(String[] args) {
        System.out.print("N: ");
        int size = sc.nextInt();
        if (size < 3 || size > 10) {
            System.out.println("INVALID INPUT");
            return;
        }
        ZigZag ob = new ZigZag(size);
        ob.input();
        System.out.print("Original Array:");
        for (int i : ob.A)
            System.out.print(i + " ");
        ob.zigzag();
    }
}