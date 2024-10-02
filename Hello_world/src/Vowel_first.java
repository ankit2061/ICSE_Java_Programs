import java.util.*;
public class Vowel_first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.next();
        String s1="",s2="";
        int i=0,l=s.length();
        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                s1=s1+ch;
            else
                s2=s2+ch;
        }
        System.out.println("Chnaged word: "+s1+s2);
    }
}
