import java.util.Scanner;

public class Fascinating {
    int num;
    boolean freq[] = new boolean[10];
    
    Fascinating(int n) {
        num = n;
    }
    
    void extract(int n) {
        while (n > 0) {
            int r = n % 10;
            freq[r] = true;
            n /= 10;
        }
    }
    
    void isFascinating() {
        extract(num);
        extract(num * 2);
        extract(num * 3);

        for (int i = 1; i <= 9; i++) {
            if (!freq[i]) {
                System.out.println(num + " is not fascinating.");
                return;
            }
        }
        System.out.println(num + " is fascinating.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer between 99 and 1000.");
        int a = sc.nextInt();
        Fascinating ob = new Fascinating(a);
        if (a > 99 && a < 1000)
            ob.isFascinating();
        else System.out.println("Invalid Input!");
        sc.close();
    }
}