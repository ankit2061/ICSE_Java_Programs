package LOYLA_PAPERSOLVE;
import java.util.*;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.next();
        System.out.println("Enter your choice(1 or 2):");
        int ch=sc.nextInt(),i=0,l=s.length();
        if(ch==2){
            String s1="";
            for(i=l-1;i>=0;i--)
                s1=s1+s.charAt(i);
            s=s1;
        }
        for(i=0;i<l;i++){
            System.out.println(s.substring(i,l));
        }
    }
}
