import java.util.*;
public class Print_words_starting_and_ending_with_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        String s1="";
        s=s+" ";
        char c,c1;
        int l=s.length();
        int i=0,j=0;
        for(i=0;i<l;i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                s1 = s.substring(j, i);
                int l1=s1.length();
                c=s1.charAt(0);
                c1=s1.charAt(l1-1);
                if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U') && (c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'))
                    System.out.println(s1);
                j = i + 1;
            }
        }
    }
}
