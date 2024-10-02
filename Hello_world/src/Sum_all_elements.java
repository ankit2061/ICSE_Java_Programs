import java.util.*;
public class Sum_all_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
       int i=0,sum=0;
        System.out.println("Enter the elements of the array:");
       for(i=0;i<n;i++){
           a[i]=sc.nextInt();
           sum+=a[i];
       }
        System.out.println("The sum of the array elements are:\t"+sum);
    }
}
