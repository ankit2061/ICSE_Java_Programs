package Don_Bosco;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,n=0,c=0,j=0,temp=0;
        n=4;
        int a[]=new int[n];
        System.out.println("Enter 10 integer numbers:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=0;
        int prime[]=new int[n];
        for(i=0;i<n;i++){
            for (j=2; j<a[i]; j++)
            {
                if (a[i]%j == 0)
                    c++;
            }
            if (c==0){
                prime[j]=a[i];
                j++;
            }
        }
       for(i=0;i<n;i++){
           for(j=1;j<(n-1);j++){
               temp=prime[j-1];
               prime[j-1]=prime[j];
               prime[j]=temp;
           }
       }
        for(i=0;i<n;i++){
            System.out.println(prime[i]);
        }
    }
}
