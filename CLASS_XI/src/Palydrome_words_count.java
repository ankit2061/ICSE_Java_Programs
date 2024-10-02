import java.util.*;
public class Palydrome_words_count
{
    String words[];
    void split_words(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text=sc.nextLine();
        words=text.split(" ");
    }
    void palyndrome_words() {
        int n = words.length;
        System.out.println("The palyndrome words are:");
        int c=0;
        for (int i = 0; i < n; i++) {
            if (words[i].length() != 1) {
                String s = words[i];
                String s1 = "";
                int j = 0, l = 0;
                l = s.length();
                for (j = l - 1; j >= 0; j--) {
                    char ch = s.charAt(j);
                    s1 = s1 + ch;
                }
                if (s1.equalsIgnoreCase(s)) {
                    System.out.println(s);
                    c++;
                }
            }
        }
        System.out.println("The number of palyndrome words are: "+c);
    }
    public static void main(String[] args) {
        Palydrome_words_count obj=new Palydrome_words_count();
        obj.split_words();
        obj.palyndrome_words();
    }
}
