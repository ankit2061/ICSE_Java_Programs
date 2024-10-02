import java.util.*;
public class Series_1 {
    int x,n;
    double s;
    Series_1(){
        s=0;
        n=0;
        s=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x=sc.nextInt();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
    }
    int fact(int no){
       int fact=1;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        return fact;
    }
    void calc(){
        for(int i=2;i<=n;i++){
            s+=Math.pow(x,i)/fact(i-1);
        }
        System.out.println("The sum of the series is: "+s);
    }
    public static void main(String[] args) {
        Series_1 ob=new Series_1();
        ob.input();
        ob.calc();
    }
}
