import java.util.*;
public class Merging_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of first array:");
        int m=sc.nextInt();
        System.out.println("Enter the number of elements of second array:");
        int n=sc.nextInt();
        int a1[]=new int[m];
        int a2[]=new int[n];
        int a3[]=new int[m+n];
        int i=0,j=0,k=0,p=0;
        System.out.println("Enter the elements of the first array:");
        for(i=0;i<m;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for(i=0;i<n;i++){
            a2[i]=sc.nextInt();
        }
        for(i=0;i<m;i++){
            a3[i]=a1[i];
        }
        for(i=m;i<(m+n);i++){
            a3[i]=a2[k];
            k++;
        }
        System.out.println("Merged Array:");
        for(i=0;i<(m+n);i++){
            System.out.println(a3[i]);
        }
    }
}
