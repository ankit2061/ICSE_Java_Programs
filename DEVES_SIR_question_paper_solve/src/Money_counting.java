/*Question:
A bank offers the following denominations of notes - Rs. 500, Rs. 100, Rs. 50, Rs. 20,
 Rs. 10, Rs. 5, Rs. 2, Re 1. Write a program to accept the money to be withdrawn.
 Find the no. of notes of each denomination to be given by the bank.
 */
import java.io.*;
public class Money_counting {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the amount of money to be withdrawn: ");
        int amt=Integer.parseInt(br.readLine());
        int i=0,f=0;
        int a[]={500,100,50,20,10,5,2,1};
        int l=a.length;
        System.out.println("NOTES\t"+"Frequency");
        for(i=0;i<l;i++)
        {
            f=amt/a[i];
            if(f>0)
                System.out.println(a[i]+"\t"+"\t"+f);
            amt=amt%a[i];
        }
    }
}
