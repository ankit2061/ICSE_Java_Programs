package SUGGESTED_STRING_PROGRAMS;
import java.util.*;
public class Pig_Latin
{
    public static void main (String [] args)
    {
        System.out.println("Enter a word");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int l = 0;
        str = str.toLowerCase();
        l = str.length();
        for(int i = 0; i<l; i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(str.substring(i)+str.substring(0,i)+"ay");
                break;
            }
        }
    }
}