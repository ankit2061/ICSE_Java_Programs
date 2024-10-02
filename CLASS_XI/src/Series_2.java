import java.util.*;
public class Series_2 {
    int x,n;
    double s;
    Series_2(){
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
            s+=((i-1)*x+i)/fact(i);
        }
        s=1+s;
        System.out.println("The sum of the series is: "+s);
    }
    public static void main(String[] args) {
        Series_1 ob=new Series_1();
        ob.input();
        ob.calc();
    }
}
