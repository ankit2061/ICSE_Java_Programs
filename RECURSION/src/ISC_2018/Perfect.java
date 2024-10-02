package ISC_2018;
import java.util.Scanner;
public class Perfect
{
    int num;
    Perfect(int nn){
        num=nn;
    }
    int sum_of_factors(int i){
        if(i==num)
            return 0;
        if(num%i==0)
            return i+sum_of_factors(i+1);
        else
            return sum_of_factors(i+1);
    }
    void check(){
        if(sum_of_factors( 1)==num)
            System.out.println(num+" is a perfect number.");
        else System.out.println(num+" is not a perfect number.");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Perfect ob=new Perfect(n);
        ob.check();
    }
}
