import java.util.Scanner;

public class GoldBach {
    
    boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    void isGoldBach(int n) {
        int p1, p2 = 0;
        for (p1 = 3; p1 < n / 2; p1++) {
            if (isPrime(p1))
                p2 = n - p1;
            if (isPrime(p2) && isPrime(p1))
                System.out.println(n + " : " + p1 + "," + p2 + "     " + (p1 + p2));
        }
    }

    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        GoldBach ob = new GoldBach();

        System.out.println("Enter an integer.");
        int a = sc.nextInt();

        if (a > 9 && a < 5000 && a % 2 == 0)
            ob.isGoldBach(a);
        else
            System.out.println("Entered no. is not GoldBach.");
        sc.close();
    }
}