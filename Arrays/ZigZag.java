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

/*
Algorithm : Zig-Zag Array
1.	Start the Algorithm.
2.	Accept an integer N representing the number of elements in the array.
3.	If N < 3 or N > 10,
display the message “INVALID INPUT” and stop the algorithm.
4.	Create an integer array A of size N.
5.	Define a function input() to accept the elements of the array.
o	For each index from 0 to N − 1:
	Accept an integer value and store it in A[index].
	If the value is negative:
	Display “INVALID INPUT”.
	Stop the algorithm immediately.
6.	Define a function zigzag() to rearrange the array in zig-zag fashion.
o	For each index i from 0 to N − 2:
	If i is even:
	If A[i] is greater than A[i + 1], interchange the two values.
	If i is odd:
	If A[i] is less than A[i + 1], interchange the two values.
o	Display the message “Zig-Zag Array:”.
o	Display all elements of the modified array.
7.	Call the function input().
8.	Display the message “Original Array:” and print the elements of the array.
9.	Call the function zigzag().
10.	Stop the Algorithm.
*/
