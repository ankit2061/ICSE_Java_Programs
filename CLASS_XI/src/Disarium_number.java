import java.util.*;
public class Disarium_number
{
    void check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int n1=n,sum=0,c=0;
        String nn=Integer.toString(n);
        c=nn.length();
        while (n1!=0)
        {
            int r = n1%10;
            sum =  sum + (int)Math.pow(r, c--);
            n1 = n1/10;
        }
        if(sum==n)
            System.out.println(n+ " is a Disarium Number");
        else
            System.out.println(n+ " is not a Disarium NUmber");
    }

    public static void main(String[] args) {
        Disarium_number obj=new Disarium_number();
        obj.check();
    }
}
