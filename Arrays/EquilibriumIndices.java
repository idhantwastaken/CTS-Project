/* Question:
Write a program to find and display all equilibrium indices of a given array of size L (3 <= L <= 50).
An equilibrium index is an index such that the sum of elements at lower
indices is equal to the sum of elements at higher indices.

For example:
Input: L: 8
Enter elements of the array: -7 1 5 2 -4 3 0 5
Output: Equilibrium Indices: 3, 6
*/
import java.util.Scanner;
class EquilibriumIndices{
    int A[], L;
    static Scanner sc = new Scanner(System.in);

    EquilibriumIndices(int ll){
        L = ll;
        A = new int[L];
    }

    void fillarray(){
        System.out.print("Array Elements: ");
        for(int i = 0;i < L; i++){
            A[i] = sc.nextInt();
        }
    }

    void indices(){
        boolean first = false;
        for(int i = 0; i < L; i++){
            int ls = 0; int rs = 0;
            for(int j = 0; j < i; j++)
                ls += A[j];
            for(int k = i + 1; k < L; k++)
                rs += A[k];
            if(rs == ls && first){
                System.out.print(i);
                first=true;
            }
            if(rs == ls) System.out.print(", "+i);
        }
        if(!first)
            System.out.print("NIL");
    }

    void display(){
        System.out.print("Array: ");
        for(int i=0;i<L;i++){
            if(i==L-1)
                System.out.print(A[i]);
            else
                System.out.print(A[i]+", ");
        }
        System.out.print("\nEquilibrium Indices: ");
        indices();
    }

    public static void main(String[]args){
        System.out.print("L: ");
        EquilibriumIndices ob=new EquilibriumIndices(sc.nextInt());
        if(ob.L<3 || ob.L>50){
            System.out.println("INVALID INPUT");
            return;
        }
        ob.fillarray();
        ob.display();   
    }
}

/*
Algorithm : Equilibrium Indices
1.	Start the Algorithm.
2.	Accept an integer L representing the number of elements in the array.
3.	If L < 3 or L > 50,
display the message “INVALID INPUT” and stop the algorithm.
4.	Create an integer array A of size L.
5.	Define a function fillArray() to accept the elements of the array.
o	For each index from 0 to L − 1,
accept an integer value and store it in A.
6.	Define a function indices() to find and display all equilibrium indices.
o	Initialize a boolean variable first as true and an integer variable count as 0.
o	For each index i from 0 to L − 1:
	Initialize ls = 0 and rs = 0.
	For indices from 0 to i − 1, add the elements to ls.
	For indices from i + 1 to L − 1, add the elements to rs.
	If ls is equal to rs and first is true:
display the index i, set first to false and increment count.
	Else if ls is equal to rs:
display a comma followed by index i and increment count.
o	If count remains 0, display “NIL”.
7.	Define a function display() to display the array and the equilibrium indices.
o	Display all the elements of the array separated by commas.
o	Display the heading “Equilibrium Indices:”.
o	Call the function indices().
8.	Call the function fillArray().
9.	Call the function display().
10.	Stop the Algorithm.

*/
