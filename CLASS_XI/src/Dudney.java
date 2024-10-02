import java.util.Scanner;

public class Dudney {
    static int Intnum;
    //int s;
    Dudney(int nn){
        Intnum=nn;
    }
    int sumDigits(int n){
        int d=0,s=0;
        while(n!=0){
            d=n%10;
            n=n/10;
            s=s+d;
        }
        return s;
    }
    void check(){
        double cbr=Math.cbrt(Intnum);
        int ss=sumDigits(Intnum);
        if(cbr==ss){
            System.out.println(Intnum+" is Dudney number");
        }
        else
            System.out.println(Intnum+" is not Dudney number");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n= sc.nextInt();
        Dudney ob=new Dudney(n);
        ob.sumDigits(Intnum);
        ob.check();
    }
}
