/*
Question 7:
Define a class to accept and store 10 strings into the array and print the strings with even
number of characters
 */
import java.util.*;
public class Sem2_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Strings:");
        String str[]=new String[10];
        int i=0,l=0;
        for(i=0;i<10;i++){
            str[i]=sc.next();
        }
        System.out.println("Strings with even number of Characters are:");
        for(i=0;i<10;i++){
            l=str[i].length();
            if(l%2==0)
                System.out.println(str[i]);
        }
    }
}
