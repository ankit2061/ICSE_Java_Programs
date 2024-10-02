import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.next();
        int l=s.length(),i=0,ucc=0,dc=0,vc=0,lc=0;
        char ch;
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(Character.isDigit(ch))
                dc++;
            if(Character.isUpperCase(ch))
                ucc++;
            if(Character.isLowerCase(ch))
                lc++;
            ch=Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vc++;
        }
        System.out.println("Total Vowels:\t"+vc);
        System.out.println("Total UpperCase Letters:\t"+ucc);
        System.out.println("Total LowerCase Letters:\t"+lc);
        System.out.println("Total digits:\t"+dc);
    }
}
