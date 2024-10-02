import java.io.*;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args)//throws IOException
    {
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one Character:");
        char ch=sc.nextLine().charAt(0);
        ch=(char)(ch+13);
        System.out.println(ch);
    }
}