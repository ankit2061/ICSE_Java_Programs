import java.util.*;
public class Question_4_pg78//PATTERN
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int i=0,l=s.length();
        for(i=1;i<=l;i++){
            System.out.println(s.substring(0,i));
        }
    }
}
