package SUGGESTED_STRING_PROGRAMS;
import java.util.*;
public class Vowel_remove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int i=0,l=s.length();

        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            else
                System.out.print(ch);
        }
    }
}
