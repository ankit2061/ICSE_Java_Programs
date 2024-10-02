import java.util.*;
public class Manufacture
{
    int N;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of boxes to be packed:");
        N=sc.nextInt();
        if(!(N<=1000)) {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    void packing(){
        int a[]={6,12,24,48};
        int box=0,s=0,n=N;
        for(int i=3;i>=0;i--){
            if(N/a[i]!=0) {
                    box = N / a[i];
                N = N % a[i];
                s=box+s;
                System.out.println(a[i] + " * " + box + " = " + (a[i] * box));
            }
            if(N<6&&N>0)
                s=s+1;
        }
        System.out.println("Remaining Boxes: "+N);
        System.out.println("Total number of boxes: "+n);
        System.out.println("Total number of cartons: "+s);
    }

    public static void main(String[] args) {
        Manufacture ob=new Manufacture();
        ob.input();
        ob.packing();
    }
}
