import java.io.*;
public class Twisted_Prime {
    public int check_prime(int n)
    {
        int i=0, c=0, r=0;
        for (i=2; i<n; i++)
        {
            if (n%i == 0)
                c++;
        }
        if (c==0)
            r=1;
        else
        {
            System.out.println (n+" is not a prime no");
            System.exit(0);
        }
        return r;

    }
    public int reverse_no(int p)
    {
        int j=0, cr=0, rn=0, rp=0;
        do
        {
            rp=p%10;
            p=p/10;
            rn=rn*10+rp;
        }while(p!=0);
        return rn;
    }

    public static void main() throws IOException
    {
        System.out.println("Enter a number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int no=Integer.parseInt(br.readLine());

        Twisted_Prime obj = new Twisted_Prime();
        int cp=obj.check_prime(no);

        int pc=obj.reverse_no(no);
        int rp=obj.check_prime(pc);

        if (cp==1 && rp==1)
            System.out.println(no+" is a twisted prime number");

    }
}
