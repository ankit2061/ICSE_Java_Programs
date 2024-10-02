import java.util.*;
public class Caesar_cipher {
    String s;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        s=sc.nextLine();
        if(!(s.length()>3&&s.length()<100)){
            System.out.println("Invalid length.");
            System.exit(0);
        }
    }
    int AtoM(char ch){
        char c = ' ';
        for (c = (Character.isUpperCase(ch) == true) ? 'A' : 'a'; (Character.isUpperCase(ch) == true) ? c <= 'M' : c <= 'm'; c++) {
            if (ch == c) {
                return 1;
            }
        }
        return 0;
    }
    int NtoZ(char ch){
        char c = ' ';
        for (c = (Character.isUpperCase(ch) == true) ? 'N' : 'n'; (Character.isUpperCase(ch) == true) ? c <= 'Z' : c <= 'z'; c++) {
            if (ch == c)
                return 1;
        }
        return 0;
    }
    void cipher() {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(AtoM(ch)==1){
                ch=(char)(ch+13);
            }
            else if (NtoZ(ch)==1){
                ch=(char)(ch-13);
            }
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Caesar_cipher ob=new Caesar_cipher();
        ob.input();
        System.out.println("The cipher text is:");
        ob.cipher();
        System.out.println();
    }

}
