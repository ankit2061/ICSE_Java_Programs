import java.util.*;
public class Question_5_pg78 //pig-latin
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine();
        s=s.toUpperCase();
        //s=s+" ";
        String s1="";
        char ch1;
        for(int i=0;i<=s.length();i++) {
            char ch = s.charAt(i);
            if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(s.substring(i) + s.substring(0, i) + "AY");
                break;
            }
        }
    }
}
