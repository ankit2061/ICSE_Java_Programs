/*
Define a class to declare a character array of size ten, accept the character into the array
and perform the following:
• Count the number of uppercase letters in the array and print.
• Count the number of vowels in the array and print.
 */
import java.util.*;
public class Sem2_Q3 {
    char ch[]=new char[10];
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 characters");
        for(int i=0;i<10;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
    }
    void countUpper()
    {
        int c=0;
        for(int i=0;i<10;i++)
        {
            int n=ch[i];
            if(n>=65&&n<=90)
                c++;
        }
        System.out.println(" No. of uppercase = " +c);
    }
    void countVowel()
    {
        int c1=0;
        for(int i=0;i<10;i++)
        {
            char ch1=Character.toLowerCase(ch[i]);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                c1++;
        }
        System.out.println(" No. of vowels = "+c1);
    }
    public static void main()
    {
        Sem2_Q3 obj=new Sem2_Q3();
        obj.accept();
        obj.countUpper();
        obj.countVowel();
    }
}