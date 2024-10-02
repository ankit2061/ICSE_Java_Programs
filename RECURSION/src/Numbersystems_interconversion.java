import java.util.*;
public class Numbersystems_interconversion {
    int n1;
    int b;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        n1=sc.nextInt();
        System.out.println("Enter the base of the system to which the number is to be converted:");
        b=sc.nextInt();
    }
    void conversion(int n,int b){
         int d=n%10;
         n=n/b;
         if(n==0)
             conversion(n/b,0);
         if(d<10)
             System.out.print(d);
         else
             System.out.print((char)(55%d));
         if(n==0)
             return;
    }
}
