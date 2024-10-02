import java.util.*;
public class Magic_number {
    int n;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
    }
    void split()
    {
        int d=0,n1=n,s=0;;

        while(n1>9){
            while(n1!=0){
                d=n1%10;
                s=s+d;
                n1=n1/10;
            }
            n1=s;
            s=0;
        }
        if(n1==1)
            System.out.println(n+" is a magic number");
        else
            System.out.println(n+" is not a magic number");
    }
    public static void main(String[] args) {
        Magic_number ob=new Magic_number();
        ob.input();
        ob.split();
    }
}
