import java.util.*;
public class Unique_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int l=s.length();
        char ch;
        int i=0,j=0,c=0;
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            c=0;
            for(j=0;j<l;j++){
                if(s.charAt(i)==ch)
                    c++;
            }
            if(c>1)
                break;
        }
        if(c>1)
            System.out.println(s+" is an unique String");
        else
            System.out.println(s+" is not an unique String");
    }
}
