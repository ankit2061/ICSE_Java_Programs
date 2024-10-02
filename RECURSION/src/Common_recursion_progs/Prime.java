package Common_recursion_progs;
import java.util.*;
public class Prime {
    boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }
    // Driver program to test above function
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Prime ob=new Prime();
        System.out.println("Enter a number to check whether it is prime or not:");
        int n=sc.nextInt();
        if (ob.isPrime(n, 2))
            System.out.println(n+"is Prime number");
        else
            System.out.println(n+"is Not a Prime number");
    }
}
