import java.util.*;
public class Circular_prime
{
    static boolean isPrime(int m)
    {
        int f=0;
        for(int i=2;i<=m/2;i++)
        {
            f=1;
            if(m%i==0)
            {
                f=0;
            }
        }
        if(f==1)
        {
            System.out.println(m+"is Prime number");
        }
        else
            System.out.println(m+"is not Prime number");
        return true;
    }
    public static void main()
    {
        int k=0;
        int a[]=new int[10];
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        String s=Integer.toString(n);
        int l=s.length();
        int divisor = (int)(Math.pow(10, l - 1));
        if(isPrime(m))
        {
            for(int i=1;i<l;i++)
            {
                k=0;
                int n1=m%divisor;
                int n2=m/divisor;
                m=n1*10+n2;
                if(!isPrime(m))
                {
                    k=1;
                    break;
                }
                else
                    k=0;
            }
            if(k==0)
                System.out.println(n+"is circular prime");
            else
                System.out.println(n+"is not circular prime");
        }
    }
}
