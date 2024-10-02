/*
Define a class to accept two strings, convert them into uppercase, check and display
whether two strings are equal or not, if the two strings are not equal, print the string with
the highest length or print the message both the strings are of equal length.
 */
import java.util.*;
public class Sem2_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        String s1e=s1.toUpperCase();
        String s2e=s2.toUpperCase();
        if(s1e.equals(s2e)){
            System.out.println("Both the strings are equal");
        }
        else{
            int l1=s1.length();
            int l2=s2.length();
            if(l1>l2)
                System.out.println("The String with highest length:\n" + s1);
            if(l1<l2)
                System.out.println("The String with highest length:\n" + s2);
            if(l1==l2)
                System.out.println("Both the Strings are of equal length.");
        }
    }
}
