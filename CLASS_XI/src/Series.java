/*
Write a menu driven java program to find the sum of the series given below.
S=1+(x+2)/2! + (2x+3)/3! + (3x+4)/4! +………. n terms
S=x2/1! + x4/3! + x6/5! +………….xn/(n-1)!

 */
import java.util.*;
public class Series
{
    int x,n;
    double s;
    static Scanner sc=new Scanner(System.in);
    Series(){
        s=0;
        n=0;
        s=0;
    }
    void input(){
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
    }
    double fact(int no){
        double f =1.0;
        for(int i=1;i<=no;i++){
            f *=i;
        }
        return f;

    }
    void calc1(){
        for(int i=2;i<=n;i++){
            s=s+((i-1)*x+i)/fact(i);
        }
         s=1+s;
        System.out.println("The sum of the series is: "+s);
    }
    void calc2(){
        for(int i=2;i<=n;i=i+2){
            s+=Math.pow(x,i)/fact(i-1);
        }
        System.out.println("The sum of the series is: "+s);
    }
    public static void main(String[] args) {
        Series ob=new Series();

        System.out.println("Enter your choice:");
        System.out.println("Enter (1) for series 1.");
        System.out.println("Enter (2) for series 2.");
        int ch=sc.nextInt();
        ob.input();
        switch(ch){
            case 1:
                ob.calc1();
                break;
            case 2:
                ob.calc2();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
