import java.awt.*;
import java.util.*;
public class Remove_extra_letters
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String s= sc.next();
        int l=s.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            int c=0;
            char ch=s.charAt(i);
            for(int j=0;j<s1.length();j++)
            {
                char ch1=s1.charAt(j);
                if (ch==ch1) {
                    c = 1;
                    break;
                }
            }
            if(c==0)
                s1=s1+ch;
        }
        System.out.print(s1);
    }
}