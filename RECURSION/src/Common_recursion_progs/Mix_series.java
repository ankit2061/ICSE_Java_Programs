package Common_recursion_progs;
import java.util.*;
public class Mix_series
{
    int fact(int n){
        if(n==1||n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    double pow(int b,int p){
        if(p==0)
            return 1.0;
        if(p<0){
            return 1/pow(b,-1*p);
        }
        else return b*pow(b,p-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mix_series ob=new Mix_series();
        System.out.println("The series is: \t1-a^2/2!+a^3/3!+a^4/4!+….+n");
        System.out.println("Enter the value of n and a:");
        int n=sc.nextInt();
        int a=sc.nextInt();
        double s=0;
        for(int i=2;i<=n;i++){
            s=s+(ob.pow(a,i)/ob.fact(i));
        }
        s=1.0-s;
        System.out.println("Answer: "+s);
    }
}
