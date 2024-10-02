import java.util.*;
public class Longest_word {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        int max = 0;
        int l = str.length();
        String str2;
        String str1[] = new String[l];
        int l1[] = new int[l];
        int a = 0;
        int b = 0;
        for(int i = 0; i<l ; i++)
        {
            if ((str.charAt(i)) == ' ')
            {
                str1[a]=str.substring(b,i);
                l1[a] = str1[a].length();
                a++;
                b=i+1;
            }
        }
        for(int i = 0; i<l; i++)
        {
            if(l1[i]>max)
            {
                max = i;
            }
        }
        System.out.println("Largest word: " + str1[max]);
    }
}
