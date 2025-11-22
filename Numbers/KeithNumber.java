import java.util.*;
class KeithNumber {
    boolean isKeith(int n) {
        int l = (int)Math.log10(n) + 1;
        int seq[] = new int[l];
        int temp = n;
        while (temp > 0) {
            seq[--l] = temp % 10;
            temp = temp / 10;
        }

        int next = 0;
        while(next < n) {
            next = 0;
            for (int i = 0; i < seq.length; i++)
                next += seq[i];
            if (next == n) return true;
            for (int i = 0; i < seq.length - 1; i++)
                seq[i] = seq[i + 1];
            seq[seq.length - 1] = next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KeithNumber ob  = new KeithNumber();
        
        System.out.println("Enter an integer.");
        int n = sc.nextInt();
        if(ob.isKeith(n)) {
            System.out.println(n + " is a keith no.");
        } else System.out.println(n + " is not a keith no.");
        sc.close();
    }
}
