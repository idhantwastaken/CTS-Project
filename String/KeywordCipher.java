import java.util.Scanner; 
class KeywordCipher{ 
    String keyword, text; 
    void accept(){ 
        Scanner sc=new Scanner(System.in); 
        System.out.print("ENTER KEYWORD: ");
        keyword=sc.nextLine().toUpperCase(); 
        System.out.print("ENTER TEXT TO BE DECODED: ");
        text=sc.nextLine().toUpperCase().trim(); 
    } 
    String key(String str){ 
        String word=""; 
        for(int i=0;i<str.length();i++){ 
            if(word.indexOf(str.charAt(i))>=0) 
                continue; 
            else if(Character.isLetter(str.charAt(i))) 
                word+=str.charAt(i); 
        } 
        return word; 
    } 
    String decrypt(){ 
        //Making decryption dictionary 
        keyword=key(keyword); 
        String A=""; 
        for(int i=0;i<keyword.length();i++){ 
            A+=keyword.charAt(i); 
        } 
        char alpha='A'; 
        for(int i=keyword.length();i<26;i++){ 
            while(keyword.indexOf(alpha)>=0){ 
                alpha++; 
            } 
            A+=alpha; 
            alpha++; 
        } 
        //Decrypting the text 
        String decTXT=""; 
        for(int i=0;i<text.length();i++){ 
            if(!Character.isLetter(text.charAt(i))) 
                decTXT+=text.charAt(i); 
            else 
                decTXT+=(char)(A.indexOf(text.charAt(i))+65); 
        } 
        return decTXT; 
    } 
    void display(){ 
        System.out.println("DECODED TEXT: "+decrypt()); 
    } 
    public static void main(String[]args){ 
        KeywordCipher obj=new KeywordCipher(); 
        obj.accept(); 
        obj.display(); 
    } 
} 