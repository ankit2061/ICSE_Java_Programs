import java.util.*;
public class Question_1_pg78//Write a program to accept a sentence and print each word on different lin
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s+" ";
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
