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
Algorithm : Doubly Markov Matrix
1.	Start the Algorithm.
2.	Accept an integer N representing the order of a square matrix.
3.	If N < 3 or N > 9,
display the message “SIZE IS OUT OF RANGE” and stop the algorithm.
4.	Create a square matrix M of size N × N.
5.	Define a function fillArray() to accept the elements of the matrix.
o	For each row index from 0 to N − 1:
	For each column index from 0 to N − 1:
	Accept a real number and store it in M[row][column].
	If the value is negative:
	Display “NEGATIVE NUMBERS ENTERED. INVALID ENTRY”.
	Stop the algorithm immediately.
6.	Define a function isMarkov() which returns a boolean value.
o	For each index i from 0 to N − 1:
	Initialize rowsum = 0 and colsum = 0.
	For each index j from 0 to N − 1:
	Add M[i][j] to rowsum.
	Add M[j][i] to colsum.
	If rowsum is not equal to 1 or colsum is not equal to 1:
	Return false.
o	After checking all rows and columns, return true.
7.	Define a function displayResult() to display the result and the matrix.
o	Call the function isMarkov().
o	If it returns true, display “FORMED MATRIX IS DOUBLY MARKOV”.
o	Otherwise, display “FORMED MATRIX IS NOT DOUBLY MARKOV”.
o	Display the elements of the matrix row-wise.
8.	Call the function fillArray().
9.	Call the function displayResult().
10.	Stop the Algorithm.
*/
