import java.util.Scanner;
class DistinctPrime {
    int n;
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        sc.close();
    }
    
    boolean isDistinctPrime() {
        String str = Integer.toString(n);
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '2' && ch != '3' && ch != '5' && ch != '7')
                return false;
            if (str.indexOf(ch) != str.lastIndexOf(ch))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        DistinctPrime ob = new DistinctPrime();
        ob.input();

        if (ob.isDistinctPrime()) {
            System.out.println(ob.n + " is a distinct prime number.");
        } else
            System.out.println(ob.n + " is not a distinct prime number.");
    }
}