import java.util.*;
public class String_Pattern_upside_down {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int i=0,l=s.length();
        for(i=l;i>=1;i--){
            System.out.println(s.substring(0,i));
        }
    }
}
