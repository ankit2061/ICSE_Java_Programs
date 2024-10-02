package Isc_2017;
import java.util.*;
/*
Caesar Cipher is an encryption technique which is implemented as ROT13 ('rotate by 13 places').
It is a simple letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, with the other characters remaining unchanged.
 */
public class Q3_Caesar_cipher {
    String s,words[];
    static int L;
    static  Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
        L=s.length();
        s=s+" ";
        words=s.split(" ");
    }
    void cipher(){
        int n= words.length;
        for(int i=0;i< n;i++){
            int l= words[i].length();
            for(int j=0;j<l;j++){
                char ch=words[i].charAt(j);
                if(Character.isLetter(ch)==true) {
                    if (ch <= 'n' || ch <= 'n') {
                        ch = (char) (ch + 13);
                    } else {
                        if (Character.isUpperCase(ch) == true) {
                            int d = 'Z' - ch;
                            ch = (char) ('A' + (13 - d-1));
                        }
                        if (Character.isLowerCase(ch) == true) {
                            int d = 'z' - ch;
                            ch = (char) ('a' + 13 - d-1);
                        }
                    }
                }
                System.out.print(ch);
            }
            System.out.print(" ");
        }

    }
    public static void main(String[] args) {
        Q3_Caesar_cipher ob=new Q3_Caesar_cipher();
        ob.input();
        if(L>3&&L<100)
        ob.cipher();
        else System.out.println("Invalid Input");

    }
}
