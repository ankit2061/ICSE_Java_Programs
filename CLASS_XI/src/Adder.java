import java.util.*;
public class Adder {
    int a[]=new int[2];
    Adder(){
        a[0]=0;
        a[1]=0;
    }
    void readtime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours and minutes:");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
    }
    void addtime(Adder X,Adder Y){
        a[0]=X.a[0]+Y.a[0];
        a[1]=X.a[1]+Y.a[1];
        if(a[1]>=60){
            int h1=a[1]/60;
            a[1]=a[1]%60;
            a[0]=a[0]+h1;
        }
    }
    void disptime(){
        System.out.println("Hours= "+a[0]);
        System.out.println("Minutes= "+a[1]);
    }
    void main(){
        Adder ad=new Adder();
        Adder ad1=new Adder();
        ad.readtime();
        System.out.println("Time 1:");
        ad.disptime();
        ad1.readtime();
        ad1.disptime();
        System.out.println("Time 2:");
        ad.addtime(ad,ad1);
        System.out.println("Total Time:");
        ad.disptime();
    }
}
