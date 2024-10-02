package ISC2024_SPECIMEN_PAPER;
import java.util.*;
public class Encode {
    String word;
    int length;
    String new_word;
    Encode(){
        word="";
        length=0;
        new_word="";
    }
    void acceptWord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a word:");
        word=sc.nextLine();
    }
    void nextvowel(){
        char V_lc[]={'a','e','i','o','u'};
        char V_Uc[]={'A','E','I','O','U'};
        char ch;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            ch=c;
            if(Character.isUpperCase(c)==true){
                for(int j = 0; j <V_Uc.length-1; j++){
                    if(c==V_Uc[j])
                        ch=V_Uc[j+1];
                    if(c=='U')
                        ch='A';
                }
            }
            if(Character.isLowerCase(c)==true){
                for(int j = 0; j <V_lc.length-1; j++){
                    if(c==V_lc[j])
                        ch=V_lc[j+1];
                    if(c=='u')
                        ch='a';
                }
            }
            new_word+=ch;
        }
    }
    void display(){
        System.out.println("ORIGINAL WORD: "+word);
        System.out.println("NEW WORD: "+new_word);
    }
    public static void main(String[] args) {
        Encode ob=new Encode();
        ob.acceptWord();
        ob.nextvowel();
        ob.display();
    }
}
