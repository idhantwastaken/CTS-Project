/* Question:
Write a program to find and display the row and column with the maximum sum of prime numbers in a given M x N matrix (2 <= M,N <= 10).
For example:
Input: M = 3, N = 3
Enter elements of the matrix:
1 2 3
4 5 6
7 8 9
Output:
Row with max prime-sum: 0 (sum= 10)
Column with max prime-sum: 1 (sum= 15)
*/
import java.util.Scanner;
class MatrixPrimeSum {
    int M, N;
    int A[][];
    MatrixPrimeSum(int mm, int nn) {
        M = mm;
        N = nn;
        A = new int[M][N];
    }
    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array elements:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
                if (A[i][j] < 0) {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }
        }
    }
    boolean isPrime(int num) {
        int f = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                f++;
        }
        return f == 2;
    }
    void maxSum() {
        int maxRow = 0, maxCol = 0;
        String rowIndex = "", colIndex = "";
        System.out.println("Original array:");
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + "\t");
                if (isPrime(A[i][j]))
                    sum += A[i][j];
            }
            System.out.println();
            if (sum > maxRow) {
                maxRow = sum;
                rowIndex = i + "";
            } else if (sum == maxRow) {
                rowIndex += " " + i;
            }
        }
        if (maxRow == 0)
            System.out.println("NO PRIME NUMBERS FOUND IN ANY ROW");
        else
            System.out.println("Row with max prime-sum: " + rowIndex + " (sum = " + maxRow + ")");
        for (int j = 0; j < N; j++) {
            int sum = 0;
            for (int i = 0; i < M; i++) {
                if (isPrime(A[i][j]))
                    sum += A[i][j];
            }
            if (sum > maxCol) {
                maxCol = sum;
                colIndex = j + "";
            } else if (sum == maxCol) {
                colIndex += " " + j;
            }
        }
        if (maxCol == 0)
            System.out.println("NO PRIME NUMBERS FOUND IN ANY COLUMN");
        else
            System.out.println("Column with max prime-sum: " + colIndex + " (sum = " + maxCol + ")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int M = sc.nextInt();
        System.out.print("N = ");
        int N = sc.nextInt();
        if (M < 3 || M > 9 || N < 3 || N > 9) {
            System.out.println("INVALID INPUT");
            return;
        }
        MatrixPrimeSum ob = new MatrixPrimeSum(M, N);
        ob.fillarray();
        ob.maxSum();
    }
}

/*
Algorithm : Matrix Prime Sum (Row-wise and Column-wise)
1.	Start the Algorithm.
2.	Accept two integers M and N representing the number of rows and columns of the matrix.
3.	If M < 3 or M > 9 or N < 3 or N > 9,
display the message “INVALID INPUT” and stop the algorithm.
4.	Create an integer matrix A of size M × N.
5.	Define a function fillArray() to accept the elements of the matrix.
o	Display a message to enter array elements.
o	For each row index from 0 to M − 1:
	For each column index from 0 to N − 1:
	Accept an integer value and store it in A[row][column].
	If the value is negative:
	Display “INVALID INPUT”.
	Stop the algorithm immediately.
6.	Define a function isPrime(num) which returns a boolean value.
o	Initialize a counter f to 0.
o	For values from 1 to num:
	If num is divisible by the value, increment f.
o	If f equals 2, return true; otherwise return false.
7.	Define a function maxSum() to find rows and columns having the maximum sum of prime numbers.
o	Initialize maxRow = 0, maxCol = 0.
o	Initialize strings rowIndex and colIndex as empty.
8.	Display the matrix row-wise.
o	For each row index from 0 to M − 1:
	Initialize sum = 0.
	For each column index from 0 to N − 1:
	Display the element A[row][column].
	If the element is prime, add it to sum.
	If sum is greater than maxRow:
	Assign sum to maxRow and store the row index in rowIndex.
	Else if sum is equal to maxRow:
	Append the row index to rowIndex.
9.	If maxRow equals 0,
display “NO PRIME NUMBERS FOUND IN ANY ROW”,
else display the row indices and maximum prime sum.
10.	For each column index from 0 to N − 1:
o	Initialize sum = 0.
o	For each row index from 0 to M − 1:
	If A[row][column] is prime, add it to sum.
o	If sum is greater than maxCol:
	Assign sum to maxCol and store the column index in colIndex.
o	Else if sum is equal to maxCol:
	Append the column index to colIndex.
11.	If maxCol equals 0,
display “NO PRIME NUMBERS FOUND IN ANY COLUMN”,
else display the column indices and maximum prime sum.
12.	Call the function fillArray().
13.	Call the function maxSum().
14.	Stop the Algorithm.

*/
