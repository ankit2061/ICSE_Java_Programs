package LOYLA_PAPERSOLVE;
import java.util.*;
public class No_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.next();
        int l=s.length(),i=0;
        if(l%2!=0){
            s=s+"#";
            l=s.length();
        }
        int last=l-1;
        for(i=0;i<l/2;i++){
            System.out.println(s.charAt(i)+" "+s.charAt(last));
            last--;
        }
    }
}
