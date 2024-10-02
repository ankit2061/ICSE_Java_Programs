import java.sql.SQLOutput;
import java.util.*;
public class Uppercase_letter_digits_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:\n1.)Count the number of uppercase words,lowercase words,vowels from a String.\n2.)Count the number of uppercase words,lowercase words,vowels from an array.");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Enter a String:");
                String s=sc.next();
                int l=s.length(),i=0,ucc=0,dc=0,vc=0,lc=0;
                boolean digi,upp,low;
                for(i=0;i<l;i++){
                    char ch=s.charAt(i);
                    digi=Character.isDigit(ch);
                    upp=Character.isUpperCase(ch);
                    low=Character.isLowerCase(ch);
                    if(digi=true)
                        dc++;
                    if(digi=true)
                        ucc++;
                    if(digi=true)
                        lc++;
                    ch=Character.toLowerCase(ch);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                        vc++;
                }
                System.out.println("Total Vowels:\t"+vc);
                System.out.println("Total UpperCase Letters:\t"+ucc);
                System.out.println("Total LowerCase Letters:\t"+lc);
                System.out.println("Total digits:\t"+dc);
                break;
        }
    }
}
