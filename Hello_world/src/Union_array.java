import java.util.*;
public class Union_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array:");
        int m=sc.nextInt();
        System.out.println("Enter the number of elements in the second array:");
        int n=sc.nextInt();
        int a1[]=new int[m];
        int a2[]=new int[n];
        int a3[]=new int[m+n];
        int i=0;
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
        for(i=0;i<n;i++){
            a3[m]=a2[i];
            m++;
        }
        System.out.println("The elements of the third array are:");
        for(i=0;i<a3.length;i++){
            System.out.println(a3[i]);
        }
    }
}
