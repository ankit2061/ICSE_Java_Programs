import java.util.*;
public class Happy
{
    static int n;
    public Happy()
    {
        n = 0;
    }
    void getnum(int nn)
    {
        n = nn;
    }
    public static int sum_sq_digits(int x)
    {
        int n1 = x;
        int r = 0;
        int s = 0;
        if(x>9)
        {
            while(x>9)
            {
                while(x!=0)
                {
                    r = x%10;
                    x = x/10;
                    s = s + (r*r);
                }
                x = s;
                s = 0;
            }
        }
        else
        {
            x = x*10;
            while(x>9)
            {
                while(x!=0)
                {
                    r = x%10;
                    x = x/10;
                    s = s + (r*r);
                }
                x = s;
                s = 0;
            }
        }
        return x;
    }
    void ishappy()
    {
        int s1 = Happy.sum_sq_digits(n);
        if(s1==1)
            System.out.println(n + " is a happy number");
        else
            System.out.println(n + " is not a happy number");
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        Happy ob = new Happy();
        ob.getnum(no);
        ob.sum_sq_digits(n);
        ob.ishappy();
    }
}
