import java.util.*;
public class Question_2_pg78 //Write a program to accept a sentence and print each word on different lines
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a a sentence");
        String s=sc.nextLine();
        s=s+" ";
        int i=0,l=s.length(),j=0,k=0;
        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                String s1=s.substring(j,i);
                int l1=s1.length();
                System.out.println(s1);
                j=i+1;
            }
        }
    }
}
