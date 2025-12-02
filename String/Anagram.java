/*Question:
Write a program to check whether two given strings are anagrams of each other.
An anagram of a string is another string that contains the same characters, only the 
order of characters can be different. 

For example:
INPUT:
Enter first string: LISTEN
Enter second string: SILENT
OUTPUT: STRINGS ARE ANAGRAMS

*/
import java.util.Scanner;
class Anagram{
    String s1,s2;

    boolean validate(String x){
        for(int i = 0; i < x.length(); i++)
            if(!Character.isLetter(x.charAt(i)) && x.charAt(i) != ' ')
                return false;
        return true;
    }

    String format(String x){
        String temp="";
        for(int i=0;i<x.length();i++)
            if(Character.isLetter(x.charAt(i)))
                temp+=x.charAt(i);

        char arr[]=temp.toCharArray();
        temp="";

        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-i-1;j++)
                if(arr[j]>arr[j+1]){
                    char n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;
                }
        
        for(int i=0;i<arr.length;i++)
            temp=temp+arr[i];
        return temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Anagram ob=new Anagram();
        
        System.out.print("Enter first string: ");
        ob.s1=sc.nextLine().toUpperCase().trim();
        System.out.print("Enter second string: ");
        ob.s2=sc.nextLine().toUpperCase().trim();

        if(ob.validate(ob.s1) && ob.validate(ob.s2)){
            if(ob.format(ob.s1).equals(ob.format(ob.s2)))
                System.out.println("STRINGS ARE ANAGRAMS");
            else
                System.out.println("STRINGS ARE NOT ANAGRAMS");
        }
        else
            System.out.println("INVALID CHARACTERS IN STRING. INVALID INPUT.");
    }
}