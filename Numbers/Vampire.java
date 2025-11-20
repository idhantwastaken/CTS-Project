import java.util.*;
class Vampire {
    int m, n;
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range.");
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
    }
    
    boolean isVampire(int n) {
        int d = (int)(Math.floor(Math.log10(n)) + 1);
        if (d % 2 == 1) return false;

        int[] no = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        Arrays.sort(no);

        for (int i = (int) Math.pow(10, d / 2 - 1); i < (int) Math.pow(10, d / 2); i++) {
            for (int j = (int) Math.pow(10, d / 2 - 1); j < (int) Math.pow(10, d / 2); j++) {
                if (i * j == n) {
                    String combined = String.valueOf(i) + String.valueOf(j);
                    int[] combinedDigits = combined.chars().map(Character::getNumericValue).toArray();
                    Arrays.sort(combinedDigits);

                    if (Arrays.equals(no, combinedDigits)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    void findVamprie() {
        int count = 0;
        System.out.print("The Vampire No.s are: \n");
        for(int i = (m < n? m : n); i <= (m < n? n : m); i++) {
            if(isVampire(i)) {                                             // Check Vampire
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println("\nFrequency: " + count);
    }
    
    public static void main(String[] args) {
        Vampire ob = new Vampire();
        ob.input();
        ob.findVamprie();
    }
}