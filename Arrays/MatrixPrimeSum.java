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
class MatrixPrimeSum{
    int M,N, A[][];
    static Scanner sc = new Scanner(System.in);

    MatrixPrimeSum(int mm, int nn){
        M = mm;
        N = nn;
        A = new int[M][N];
    }

    void fillarray(){
        System.out.print("Array Elements: ");
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = sc.nextInt();
            }
        }
    }

    boolean isPrime(int num){
        boolean flag = true;
        if(num == 1 || num == 0)
            flag = false;
        else
            for(int i = 2; i <= num / 2; i++)
                if(num % i == 0)
                    flag = false;
        return flag;
    }

    void maxSum(){
        int maxcol = 0, colpos = 0, maxrow = 0, rowpos = 0;

        for(int i = 0; i < M; i++){
            int colsum = 0, rowsum = 0;
            for(int j = 0; j < N; j++){
                if(isPrime(A[j][i]))
                    colsum += A[j][i];
                if(isPrime(A[i][j]))
                    rowsum += A[i][j];
            }
            if(colsum > maxcol){
                maxcol = colsum; colpos = i;
            }
            if(rowsum > maxrow){
                maxrow = rowsum; colpos = i;
            }
        }
        System.out.println("Row with max prime-sum: " + rowpos + "(sum= " + maxrow + ")");
        System.out.println("Column with max prime-sum: " + colpos + "(sum= " + maxcol + ")");
    }

    void displayArray(){
        for (int[] i : A) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        System.out.print("M: ");
        int M = sc.nextInt();
        System.out.print("N: ");
        int N = sc.nextInt();
        if(M < 2 || N < 2 || M > 10 || N > 10){
            System.out.println("INVALID INPUT");
            return;
        }
        MatrixPrimeSum ob = new MatrixPrimeSum(M,N);
        ob.fillarray();
        System.out.println("Matrix:");
        ob.displayArray();
        ob.maxSum();
    }
}