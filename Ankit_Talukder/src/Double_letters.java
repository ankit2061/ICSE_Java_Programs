import java.util.*;
public class Double_letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        char c1,c2;
        int i=0,l=s.length(),c=0;
        for(i=1;i<=l;i++) {
            c1 = s.charAt(i);
            c2 = s.charAt(i + 1);
            if (c1 == c2)
                c++;
        }
        System.out.println("Total number of double sequences: "+c);
    }
}