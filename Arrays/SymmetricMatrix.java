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