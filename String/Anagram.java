import java.util.Scanner;
class Anagram{
    static String s1,s2;
    boolean validate(String x){
        boolean flag=true;
        for(int i=0;i<x.length();i++){
            if(Character.isDigit(x.charAt(i))){
                flag=false;
            }
        }
        return flag;
    }
    String format(String x){
        String temp="";
        for(int i=0;i<x.length();i++){
            if(Character.isLetter(x.charAt(i))){
                temp+=x.charAt(i);
            }
        }
        char arr[]=temp.toCharArray();
        temp="";
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            temp=temp+arr[i];
        }
        return temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Anagram ob=new Anagram();
        System.out.print("Enter first string: ");
        s1=sc.nextLine().toUpperCase().trim();
        System.out.println("Enter second string: ");
        s2=sc.nextLine().toUpperCase().trim();
        if(ob.validate(s1) && ob.validate(s2)){
            if(ob.format(s1).equals(ob.format(s2)))
                System.out.println("STRINGS ARE ANAGRAMS");
            else
                System.out.println("STRINGS ARE NOT ANAGRAMS");
        }
        else
            System.out.println("INVALID CHARACTERS IN STRING. INVALID INPUT.");
    }
}