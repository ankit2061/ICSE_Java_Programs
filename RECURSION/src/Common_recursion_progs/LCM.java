package Common_recursion_progs;
import  java.util.*;
public class LCM {
    int p=1;
    int lcm(int n,int m){
        if(p%m==0&&p%n==0){
            return p;
        }
        else {
            p++;
            return lcm(m, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers whose LCM you want to find:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        LCM ob=new LCM();
        System.out.println("The GCD is: "+ob.lcm(n1,n2));
    }
}
