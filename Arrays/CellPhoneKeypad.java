/*Question:
Write a program to calculate the number of keystrokes required to type a given word on a
cell phone keypad. The mapping of letters to keypad numbers is as follows:

*/
import java.util.Scanner;
class CellPhoneKeypad{
    String word;
    CellPhoneKeypad(String w){
        word=w;
    }
    int keystrokes(){
        int count=0;
        for(int i=0;i<word.length();i++){
            if("ADGJMPTW".indexOf(word.charAt(i))>=0)
                count+=1;
            if("BEHKNQUX".indexOf(word.charAt(i))>=0)
                count+=2;
            if("CFILORVY".indexOf(word.charAt(i))>=0)
                count+=3;
            if("SZ".indexOf(word.charAt(i))>=0)
                count+=4;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String st=sc.next().toUpperCase();
        for(int i=0; i<st.length(); i++){
            if(!Character.isLetter(st.charAt(i))){
                System.out.println("INVALID ENTRY");
                return;
            }
        }
        CellPhoneKeypad ob=new CellPhoneKeypad(st);
        System.out.println("Number of Keystrokes = "+ob.keystrokes());
    }
}