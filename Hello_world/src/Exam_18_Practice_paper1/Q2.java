package Exam_18_Practice_paper1;
/*
QUESTION:
Define a class in Java to read a string from console and replace
all occurrences of the third character of the string by the digit.
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        System.out.println("Enter the digit you want to replace with:");
        char d=sc.next().charAt(0);
        //System.out.println(s.substring(0,2)+d+s.substring(3));
        char ch=s.charAt(2);
        System.out.println(s.replace(ch,d));
    }
}
/*OUTPUT:
Enter a String
Joseph Joestar
Enter the digit you want to replace with:
8
Jo8eph Joe8tar
 */
