import java.util.Scanner;
class InsertWord{
    boolean validate(String str){
        if(str.length()==0)
            return false;
        if(".?!".indexOf(str.charAt(str.length()-1))<0)
            return false;
        return true;
    }
    String delSpace(String str){
        String temp="";
        for(int i=0;i<str.length();i++){
            if(Character.isWhitespace(str.charAt(i)) && i!=str.length()-1 && str.charAt(i)==str.charAt(i+1))
                continue;
            else
                temp+=str.charAt(i);
        }
        return temp;
    }
    String insert(String str, String wrd, int ind){
        String temp=""; int count=0;
        int i=0;
        while(count<ind-1){
            if(str.charAt(i)==' '){
                count++;
            }
            temp+=str.charAt(i);
            i++;
        }
        temp+=wrd+" ";
        for(int j=i;j<str.length();j++){
            temp+=str.charAt(j);
        }
        return temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        InsertWord ob=new InsertWord();
        System.out.print("INPUT: ");
        String sent=sc.nextLine();
        if(!ob.validate(sent)){
            System.out.println("INVALID INPUT");
            return;
        }
        System.out.print("WORD TO BE INSERTED: ");
        String wrd=sc.next();
        System.out.print("WORD POSITION IN SENTENCE: ");
        int index=sc.nextInt();
        System.out.print("OUTPUT: "+ob.insert(ob.delSpace(sent), wrd,index));
    }
}