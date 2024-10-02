 import java.util.*;
public class Stringload
{
    public void Stringload(String s,char ch1, char ch2)
    {
        int l = s.length();
        String st1 = "";
        int i = 0;
        char c;
        for(i=0;i<l;i++)
        {
            c = s.charAt(i);
            if(c==ch1)
              st1 = st1 + ch2;
            else
              st1 = st1 + c;
        }
        System.out.println(st1);
    }
    public void Stringload(String s)
    {
        int fs = s.indexOf(' ');
        int ls = s.lastIndexOf(' ');
        System.out.println("Index of the first space is: " + fs);
        System.out.println("Index of the last space is: " + ls);
    }
    public void Stringload(String s1,String s2)
    {
        String str = s1.concat(" ").concat(s2);
        System.out.println(str);
    }

    public static void main (String args[])
    {
        Stringload obj = new Stringload();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String  str1 = sc.nextLine();
        System.out.println("Enter the character to be replaced");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter the character by which the above character is to be replaced");
        char ch2 = sc.next().charAt(0);
        obj.Stringload(str1,ch1,ch2);
        System.out.println("Enter a word to find its first and last space index");
        String str5 = sc1.nextLine();
        obj.Stringload(str5);
        System.out.println("Enter two words to concat");
        String str3 = sc2.nextLine();
        String str4 = sc2.nextLine();
        obj.Stringload(str3,str4);
    }
}