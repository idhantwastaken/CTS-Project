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
        boolean first = true; int count = 0;
        for(int i = 0; i < L; i++){
            int ls = 0; int rs = 0;
            for(int j = 0; j < i; j++)
                ls += A[j];
            for(int k = i + 1; k < L; k++)
                rs += A[k];
            if(rs == ls && first){
                System.out.print(i); count++;
                first=false;
            }
            else if(rs == ls){
                System.out.print(", "+i); count++;
            }
        }
        if(count==0)
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