import java.util.Scanner;

public class Pronic {
    static int num;
    Pronic(int n){
        num=n;
    }
    boolean isPronic(int v){
        int i=0,f=0;
        for(i=1;i<num;i++){
            if(i*(i+1)==num){
                f=1;
                break;
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }
    void check(){
        boolean tt=isPronic(num);
        if(tt==true)
            System.out.println(num+" is a Pronic number");
        else
            System.out.println(num+" is not a Pronic number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n= sc.nextInt();
        Pronic obj=new Pronic(n);
        obj.isPronic(num);
        obj.check();
    }
}
