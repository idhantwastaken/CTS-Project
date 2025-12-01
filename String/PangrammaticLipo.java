import java.util.Scanner;
class PangrammaticLipo{
    static Scanner sc=new Scanner(System.in);
    String sent;
    PangrammaticLipo(String s){
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
    int check(){
        int count=0;
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alpha.length();i++){
            if(sent.toLowerCase().indexOf(alpha.charAt(i))<0){
                count++;
            }
        }
        return count;
    }
    void missing(){
        String alpha="abcdefghijklmnopqrstuvwxyz"; String missing="";
        for(int i=0;i<alpha.length();i++){
            if(sent.toLowerCase().indexOf(alpha.charAt(i))<0){
                missing+=alpha.charAt(i)+" ";
            }
        }
        System.out.println("Missing: "+missing);
    }
    public static void main(String[]args){
        System.out.println("Enter a sentence.");
        PangrammaticLipo ob=new PangrammaticLipo(sc.nextLine());
        if(!ob.validate()){
            System.out.println("INVALID INPUT");
            return;
        }
        if(ob.check()==0)
            System.out.println("IT IS A PANGRAM");
        else if(ob.check()==1){
            System.out.println("PANGRAMMATIC LIPOGRAM");
            ob.missing();
        }
        else{
            System.out.println("NEITHER");
            ob.missing();
        }
    }
}
