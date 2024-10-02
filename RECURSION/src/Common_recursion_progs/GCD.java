package Common_recursion_progs;
import java.util.*;
public class GCD {
    int gcd(int p,int q){
        if(q==0)
            return p;
        return gcd(q,p%q);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers whose GCD you want to find:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        GCD ob=new GCD();
        System.out.println("The GCD is: "+ob.gcd(n1,n2));
    }
}
