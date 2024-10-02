package Common_recursion_progs;
import java.util.*;
public class Power
{
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
        System.out.println("Enter the number:");
        int n1=sc.nextInt();
        System.out.println("Enter the power:");
        int n2=sc.nextInt();
        Power ob=new Power();
        System.out.println("The answer is: "+ob.pow(n1,n2));
    }
}
