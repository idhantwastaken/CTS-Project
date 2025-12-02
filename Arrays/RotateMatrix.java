/*Question:
Write a program to rotate a matrix of size M x N (3 <= M,N <= 9) by 90 degrees in the clockwise direction.
Also, calculate the sum of all odd elements in the matrix.

For example:
INPUT: M: 3
       N: 4
       Matrix elements:
       1 2 3 4
       5 6 7 8
       9 10 11 12
OUTPUT: ORIGINAL MATRIX:
        1 2 3 4
        5 6 7 8
        9 10 11 12
        ROTATED MATRIX:
        9 5 1
        10 6 2
        11 7 3
        12 8 4
        SUM OF THE ODD ELEMENTS = 36
*/
import java.util.Scanner;
class RotateMatrix{
    static Scanner sc=new Scanner(System.in);
    int A[][], m,n;
    RotateMatrix(int mm, int nn){
        m=mm;
        n=nn;
        A=new int[m][n];
    }
    void fillarray(){
        System.out.print("ENTER THE ELEMENTS OF THE MATRIX:");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                A[i][j]=sc.nextInt();
    }
    void sum(){
        int sum=0;
        for(int i[]: A)
            for(int j: i)
              if(j%2!=0)
                  sum+=j;
        System.out.println("SUM OF THE ODD ELEMENTS = " + sum);
    }
    int[][] rotmat(){
        int rotmat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rotmat[i][j]=A[m-1-j][i];
            }
        }
        return rotmat;
    }
    void display(int arr[][], int m, int n){
        for(int i[]: arr){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        System.out.print("M: ");
        int M=sc.nextInt();
        System.out.print("N: ");
        int N=sc.nextInt();
        if(M<3 || N<3 || M>9 || N>9){
            System.out.println("INVALID INPUT");
            return;
        }
        RotateMatrix ob=new RotateMatrix(M,N);
        ob.fillarray();
        System.out.println("ORIGINAL MATRIX:");
        ob.display(ob.A, M, N);
        System.out.println("ROTATED MATRIX:");
        ob.display(ob.rotmat(), N, M);
        ob.sum();
    }
}
