import java.util.*;
public class Pronic {
    int num;
    Pronic(){
        num=0;
    }
    void acceptnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
    }
    boolean isPronic(int n, int i){
        if(n==0)
            return true;
        if (i == n)
            return false;
        else if (i*(i+1) == n)
            return true;
        else
            return isPronic(n,i+1);
    }
    void check(){
        if(isPronic(num,0)==true)
            System.out.println(num+" is a Pronic number");
        else System.out.println(num+" is not a Pronic number");
    }

    public static void main(String[] args) {
        Pronic ob=new Pronic();
        ob.acceptnum();
        ob.check();
    }
}
