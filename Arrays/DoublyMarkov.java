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
    static Scanner sc = new Scanner(System.in);
    
    DoublyMarkov(int nn){
        N = nn;
        M = new double[N][N];
    }
    
    void fillarray(){
        System.out.println("Enter elements of the matrix: ");
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++){
            M[i][j] = sc.nextDouble();
            if(M[i][j] < 0){
                System.out.println("NEGATIVE NUMBERS ENTERED. INVALID ENTRY");
                System.exit(0);
            }
        }
    }

    boolean isMarkov(){
        for(int i = 0; i < N; i++){
            double rowsum = 0, colsum = 0;
            for(int j = 0; j < N; j++){
                if(M[i][j] < 0) return false;   
                rowsum += M[i][j];
                colsum += M[j][i];
            }
            if(rowsum != 1 || colsum != 1) return false;   
        }
        return true;
    }

    void display(){
        if(isMarkov())
            System.out.println("FORMED MATRIX IS DOUBLY MARKOV");
        else
            System.out.println("FORMED MATRIX IS NOT DOUBLY MARKOV");
        for(double i[]: M){
            for(double j: i)
                System.out.print(j+" ");
            System.out.println();
        }
    }

    public static void main(String[]args){
        System.out.print("N: ");
        DoublyMarkov ob = new DoublyMarkov(sc.nextInt());
        if(ob.N < 3 || ob.N > 9){
            System.out.println("SIZE IS OUT OF RANGE");
            return;
        }
        ob.fillarray();
        ob.display();
    }
}