/* Question:
Write a program to check whether a given square matrix of order N (3 <= N <= 9) is a doubly Markov matrix or not.
A square matrix is said to be a doubly Markov matrix if the sum of elements of each row and each column is equal to 1 
and all elements are non-negative.

For example:
Input: N = 3
Enter elements of the matrix: 
0.2 0.5 0.3
0.4 0.4 0.2
0.4 0.1 0.5
Output: FORMED MATRIX IS DOUBLY MARKOV
0.2 0.5 0.3
0.4 0.4 0.2
0.4 0.1 0.5
*/
import java.util.Scanner;
class DoublyMarkov{
    int N; double M[][];
    DoublyMarkov(int nn){
        N=nn;
        M=new double[N][N];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                M[i][j]=sc.nextDouble();
    }
    boolean check(){
        boolean flag=true;
        for(int i=0;i<N;i++){
            double rowsum=0, colsum=0;
            for(int j=0;j<N;j++){
                if(M[i][j]<0){
                    flag=false;
                }
                rowsum+=M[i][j];
                colsum+=M[j][i];
            }
            if(rowsum!=1 || colsum!=1)
                flag=false;
        }
        return flag;
    }
    void display(){
        System.out.println("FORMED MATRIX");
        for(double i[]: M){
            for(double j: i)
                System.out.print(j+" ");
            System.out.println();
        }
        if(check())
            System.out.println("IT IS A DOUBLY MARKOV MATRIX");
        else
            System.out.println("IT IS NOT A DOUBLY MARKOV MATRIX");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("N: ");
        DoublyMarkov ob=new DoublyMarkov(sc.nextInt());
        if(ob.N<3 || ob.N>9){
            System.out.println("SIZE IS OUT OF RANGE. INVALID ENTRY");
            return;
        }
        System.out.print("Enter elements in the matrix: ");
        ob.fillarray();
        for(int i=0;i<ob.N;i++)
            for(int j=0;j<ob.N;j++)
                if(ob.M[i][j]<0){
                    System.out.println("NEGATIVE NUMBERS ENTERED. INVALID ENTRY");
                    return;
                }
        ob.display();
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
