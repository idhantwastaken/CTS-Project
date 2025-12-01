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
        int q=0;
        for(int i=0;i<n;i++){
            int p=m-1;
            for(int j=0;j<m;j++){
                rotmat[i][j]=A[p][q];
                p--;
            }
            q++;
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
        System.out.print("M=");
        int M=sc.nextInt();
        System.out.print("N=");
        int N=sc.nextInt();
        if(M<3 || N<3 || M>9 || N>9){
            System.out.println("INVALID INPUT");
            return;
        }
        RotateMatrix ob=new RotateMatrix(M,N);
        ob.fillarray();
        System.out.println("ORIGINAL MATRIX");
        ob.display(ob.A, M, N);
        System.out.println("ROTATED MATRIX");
        ob.display(ob.rotmat(), N, M);
        ob.sum();
    }
}