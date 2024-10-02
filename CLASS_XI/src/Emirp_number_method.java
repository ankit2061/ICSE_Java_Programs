import java.util.*;
public class Emirp_number_method {
    int prime_check(int n){
        int i=0,c=0,f=0;
        for (i=2; i<n/2; i++)
        {
            if (n%i == 0)
                c++;
        }
        if(c==0)
            f=1;
        else
            f=0;
        return f;
    }
    int reverse(int n){
        int r=0,s=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        return s;
    }
    public static void main(String[] args) {
        Emirp_number_method ob=new Emirp_number_method();
        Scanner sc=new Scanner(System.in);
        int check=0,n1=0,reverse_no=0,reverse_check=0;
        System.out.println("Enter a number:");
        n1=sc.nextInt();
        check= ob.prime_check(n1);
        if(check==0)
            System.out.println(n1+" is not a prime number");
        else if(check==1){
            reverse_no=ob.reverse(n1);
            reverse_check=ob.prime_check(reverse_no);
            if(reverse_check==1)
                System.out.println(n1+" is an emirp number");
            else if(reverse_check==0)
                System.out.println(n1+" is a prime number but not an emirp number");
        }
    }
}
