package Loops;
import java.util.*;
public class Series_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s=0;
        int n=0,i=0,j=0;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            int x=1;
            for(j=1;j<=i;j++){
                x=x*j;
            }
            s=s+(double)1/x;
        }
    }
}
