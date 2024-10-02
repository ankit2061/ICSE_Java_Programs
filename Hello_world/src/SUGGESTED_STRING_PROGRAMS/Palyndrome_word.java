package SUGGESTED_STRING_PROGRAMS;
import java.util.*;
public class Palyndrome_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.nextLine();
        String s1="";
        int i=0,l=0;
        l=s.length();
        for(i=l-1;i>=0;i--){
            char ch=s.charAt(i);
            s1=s1+ch;
        }

        if(s1.equalsIgnoreCase(s)){
            System.out.println(s+" is palyndrome word");
        }
        else
            System.out.println(s+" is not a palyndrome word");
    }
}
