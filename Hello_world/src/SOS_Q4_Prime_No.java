import java.util.*;
public class SOS_Q4_Prime_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=20,a[]=new int[n],i=0,sum=0,c=0;
        System.out.println("Enter 20 integers:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum of the 20 elements: "+sum);
        System.out.println("The Prime numbers are:");
        for(i=0;i<n;i++){
            for (int j=2; j<a[i]; j++)
            {
                if (a[i]%j == 0)
                    c++;
            }
            if (c==0)
                System.out.println(a[i]);
        }
    }
}
