/*
Define a class to accept a string, convert it into lowercase and check whether the string is
a palindrome or not.
A palindrome is a word which reads the same backward as forward.
Example:
madam, racecar etc.
 */
import java.util.*;
public class Sem2_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String rs="";
        int l=s.length();
        int i=0;
        for(i =l-1;i>=0;--i) {
            rs =rs+s.charAt(i);
        }
        if (s.equals(rs)) {
            System.out.println(s+" is a Palindrome String.");
        }
        else {
            System.out.println(s+" is not a Palindrome String.");
        }
    }
}
