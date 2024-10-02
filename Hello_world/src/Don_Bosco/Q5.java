package Don_Bosco;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String s=sc.nextLine();
        s=s+" ";
        int i=0,l=s.length(),c=0;
        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' ')
                c++;
        }
        System.out.println("No. of words: "+c);
        System.out.println("No. of letters: "+(l-c));
    }
}
