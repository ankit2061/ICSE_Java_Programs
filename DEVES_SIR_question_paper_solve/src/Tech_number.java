/*Question:
i.A tech number is the number whose number of digits must be even.
ii.Partition the number from the middle and then the partition
value's sum after squaring is equal to that number.
 */
import java.util.*;
public class Tech_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int n1=n;
        int d=0,s=0,sq=0,c=0,a,b;
        while(n!=0){
            d=n%10;
            c++;
            n=n/10;
        }
           a=n1%((int)Math.pow(10,c/2));
            b=n1/((int)Math.pow(10,c/2));
            s=(a+b)*(a+b);
            if(n1==s&&c%2==0)
                System.out.println(n1+" is a tech number");
            else
                System.out.println(n1+" is not a tech number");
    }
}
