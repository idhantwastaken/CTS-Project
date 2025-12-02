/*Question:
Write a program to check whether a given square matrix of size M x M (2 <= M <= 10) is symmetric or not.
A matrix is said to be symmetric if the element at the ith row and jth column is equal to the element
at the jth row and ith column for all i and j. Also, calculate the sum of the left and right diagonals of the matrix.

For example:
INPUT: M: 3
       Matrix elements:
       1 2 3
       2 4 5
       3 5 6
OUTPUT: ORIGINAL MATRIX
        1 2 3
        2 4 5
        3 5 6
        THE GIVEN MATRIX IS SYMMETRIC.
        THE SUM OF THE LEFT DIAGONAL: 11
        THE SUM OF THE RIGHT DIAGONAL: 15
*/
import java.util.Scanner;
class SymmetricMatrix{
    int M, A[][];
    static Scanner sc = new Scanner(System.in);

    SymmetricMatrix(int mm){
        M = mm;
        A = new int[M][M];
    }

    void fillarray(){
        System.out.println("Enter elements of the matrix: ");
        for(int i = 0; i < M; i++)
            for(int j = 0; j < M; j++)
                A[i][j] = sc.nextInt();
    }

    boolean symCheck(){
        for(int i = 0; i < M; i++)
            for(int j = 0; j < M; j++)
                if(A[i][j] != A[j][i]){
                    return false;
                }
        return true;
    }

    void diagSum(){
        int Ldiag = 0, Rdiag = 0;
        for(int i = 0; i < M; i++)
            for(int j = 0; j < M; j++){
                if(i == j)
                    Ldiag += A[i][j];
                if(i + j == M - 1)
                    Rdiag += A[i][j];
            }
        System.out.println("THE SUM OF THE LEFT DIAGONAL: " + Ldiag);
        System.out.println("THE SUM OF THE RIGHT DIAGONAL: " + Rdiag);
    }

    void display(){
        System.out.println("ORIGINAL MATRIX");
        for(int i[]: A){
            for(int j: i)
                System.out.print(j + " ");
            System.out.println();
        }
        if(symCheck())
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC.");
        else
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC.");
        diagSum();
    }

    public static void main(String[]args){
        System.out.print("M: ");
        SymmetricMatrix ob=new SymmetricMatrix(sc.nextInt());
        if(ob.M<2 || ob.M>10){
            System.out.println("SIZE IS OUT OF RANGE.");
            return;
        }
        ob.fillarray();
        ob.display();
    }
}

/*
Algorithm : Symmetric Matrix with Diagonal Sums
1.	Start the Algorithm.
2.	Accept an integer M representing the order of a square matrix.
3.	If M < 2 or M > 10,
display the message “SIZE IS OUT OF RANGE.” and stop the algorithm.
4.	Create an integer matrix A of size M × M.
5.	Define a function fillArray() to accept the elements of the matrix.
•	Display a message to enter the matrix elements.
•	For each row index from 0 to M − 1:
•	For each column index from 0 to M − 1:
•	Accept an integer value and store it in A[row][column].
6.	Define a function symCheck() which returns a boolean value.
•	For each row index from 0 to M − 1:
•	For each column index from 0 to M − 1:
•	If A[i][j] is not equal to A[j][i], return false.
•	If all corresponding elements are equal, return true.
7.	Define a function diagSum() to find the diagonal sums.
•	Initialize Ldiag = 0 and Rdiag = 0.
•	For each row index from 0 to M − 1:
•	For each column index from 0 to M − 1:
•	If i equals j, add A[i][j] to Ldiag.
•	If i + j equals M − 1, add A[i][j] to Rdiag.
•	Display the sum of the left diagonal.
•	Display the sum of the right diagonal.
8.	Define a function display() to display the matrix and results.
•	Display the original matrix row-wise.
•	Call the function symCheck():
•	If it returns true, display “THE GIVEN MATRIX IS SYMMETRIC.”
•	Otherwise, display “THE GIVEN MATRIX IS NOT SYMMETRIC.”
•	Call the function diagSum().
9.	Call the function fillArray().
10.	Call the function display().
11.	Stop the Algorithm.

*/
