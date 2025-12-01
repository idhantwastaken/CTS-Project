import java.util.*; 
class SnowBall{ 
    Scanner sc=new Scanner (System.in); 
    String str; 
    void accept(){ 
        System.out.println("Enter a string."); 
        str=sc.nextLine(); 
    } 
    boolean check(){ 
        boolean flag=true; 
        StringTokenizer ob=new StringTokenizer(str,".? "); 
        if(str.endsWith(".") ||str.endsWith("?")){ 
            for(int i=0;i<ob.countTokens()-1;i++){ 
                if(ob.nextToken().length()!=ob.nextToken().length()-1){ 
                    flag=false; 
                    break; 
                } 
            } 
            return flag; 
        } 
        else{ 
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT"); 
            return false; 
        } 
    } 
    void display(){ 
        if(check()) 
            System.out.println("IT IS A SNOWBALL STRING"); 
        else 
            System.out.println("IT IS NOT A SNOWBALL STRING"); 
    } 
    public static void main(String[]args){ 
        SnowBall obj=new SnowBall(); 
        obj.accept(); 
        obj.display(); 
    } 
}