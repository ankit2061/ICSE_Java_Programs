package ISC_2019;
import java.util.*;
/*
Write a program to accept a sentence which may be terminated by either ‘.’, ‘?’ or ‘!’ only. The words are to be separated by a single blank space and are in uppercase.

Perform the following tasks:

(a) Check for the validity of the accepted sentence.

(b) Convert the non-palindrome words of the sentence into palindrome words by concatenating the word by its reverse (excluding the last character).
 */
public class Q3_Palindrome_maker {
    String s,words[];
    int l;
    static Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
        int l1 =s.length();
        if(!(s.charAt(l1 -1)=='?'||s.charAt(l1 -1)=='.'||s.charAt(l1 -1)=='!')){
            System.out.println("Invalid input");
            System.exit(0);
        }
        s=s.substring(0, l1 -1);
        s=s+" ";
        words=s.split(" ");
        l = words.length;
    }
    void palin(){
        String s1;
        for(int i=0;i<l;i++){
            StringBuffer sb=new StringBuffer(words[i]);
            if(!(sb.reverse().equals(words[i]))){
                s1=words[i].substring(0,words[i].length()-1);
                StringBuffer sb1=new StringBuffer(s1);
                words[i]=words[i]+sb1.reverse();
            }
            System.out.print(words[i]+" ");
        }
        System.out.println(".");
    }

    public static void main(String[] args) {
        Q3_Palindrome_maker ob=new Q3_Palindrome_maker();
        ob.input();
        ob.palin();
    }
}
