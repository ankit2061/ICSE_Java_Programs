import java.util.*;
public class Replace_vowel_with_hash {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String");
            String s=sc.nextLine(),s1="";
            s=s+" ";
            int i=0,l=s.length();
            System.out.println("After change:");
            for(i=0;i<l;i++){
                char ch=s.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ch='#';
                }
                s1=s1+ch;
            }
            System.out.println(s1);
        }
}
