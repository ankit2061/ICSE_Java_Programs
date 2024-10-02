/*Question:
Declare a class with name number.
*DATA MEMBER*
-->m
-->n
*MEMBER METHODS*
-->number(int,int)-to initialize data member
-->boolean prime(int)-to check whether the number is prime or not.
-->int reverse(int)-to reverse the number.
-->void display- to display the emire number
 */
import java.util.*;
public class number {
    int m,n;
    number(int a,int b){
        m=0;
        n=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of m and n:");
        m=sc.nextInt();
        n=sc.nextInt();
    }
    boolean prime(int p){
        int i=0;
        for(i=0;i<=p/2;i++){
            if(p%i==0)
                return false;
        }
        return true;
    }
    int reverse(int a){
        int r=0,d;
        int n1=a;
        while(a!=0){
            d=a%10;
            r=r*10+d;
            a=a/10;
        }
        return r;
    }
    void display(){
        int i,x;
        for(i=m;i<=n;i++){
            x=reverse(i);
            if(prime(i)==true&&prime(x)==true){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        number ob=new number(0,0);
        ob.accept();
        ob.display();
    }
}
