import java.util.*;
public class Emirp_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int n1=0,r=0,s=0,c=0,c1=0,j=0;
        n1=n;
        while(n!=0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
            for (j=2; j<n1/2; j++)
            {
                if (n1%j == 0)
                    c++;
            }
        for (j=2; j<s/2; j++)
        {
            if (s%j == 0)
                c1++;
        }
            if (c==0&&c1==0)
                System.out.println(n1+" is an emirp number");
            else
                System.out.println(n1+" is not an emirp number");
    }
}
