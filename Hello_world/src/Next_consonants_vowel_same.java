import java.util.*;
public class Next_consonants_vowel_same {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        String s1="";
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
                s1=s1+ch;
            else if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                s1=s1+(char)(ch+1);
            else
                s1=s1+ch;
        }
        System.out.println(s1);
    }
}

