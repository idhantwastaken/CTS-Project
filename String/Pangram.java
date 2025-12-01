import java.util.Scanner;
import java.util.StringTokenizer;
class Pangram{
    static Scanner sc=new Scanner(System.in);
    String sent;
    Pangram(String s){
        sent=s.trim();
    }
    boolean validate(){
        if(sent.length()==0)
            return false;
        if(".?!".indexOf(sent.charAt(sent.length()-1))<0)
            return false;
        for(int i=0;i<sent.length()-1;i++){
            if(!Character.isLetter(sent.charAt(i)) && !Character.isWhitespace(sent.charAt(i)))
                return false;
        }
        return true;
    }
    boolean isPangram(){
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<alpha.length();i++){
            if(sent.toUpperCase().indexOf(alpha.charAt(i))<0){
                return false;
            }
        }
        return true;
    }
    void words(){
        StringTokenizer st=new StringTokenizer(sent," !?.");
        String temp=st.nextToken();
        String lng=temp, sht=temp;
        while(st.hasMoreTokens()){
            temp=st.nextToken();
            if(temp.length()>lng.length())
                lng=temp;
            if(temp.length()<sht.length())
                sht=temp;
        }
        System.out.println("Longest Word: "+lng);
        System.out.println("Shortest Word: "+sht);
    }
    public static void main(String[]args){
        System.out.println("Enter a sentence.");
        Pangram ob=new Pangram(sc.nextLine());
        if(!ob.validate()){
            System.out.println("INVALID INPUT");
            return;
        }
        if(ob.isPangram())
            System.out.println("IT IS A PANGRAM");
        else
            System.out.println("IT IS NOT A PANGRAM");
        ob.words();
    }
}