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
