package Common_recursion_progs;
import java.util.*;
public class Factorial
{
    int fact(int n){
        if(n==1||n==0)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find:");
        int n=sc.nextInt();
        Factorial ob=new Factorial();
        System.out.println("The factorial of n is: "+ob.fact(n));
    }
}
