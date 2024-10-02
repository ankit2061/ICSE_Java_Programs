import java.util.*;
public class Merge_alternatively {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of first array:");
        int m=sc.nextInt();
        System.out.println("Enter the number of elements of second array:");
        int n=sc.nextInt();
        int a1[]=new int[m],a2[]=new int[n],a3[]=new int[m+n];
        int i=0,j=0,k=0,p=0;
        System.out.println("Enter the elements of the first array:");
        for(i=0;i<m;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for(i=0;i<n;i++){
            a2[i]=sc.nextInt();
        }
        for(i=0;i<m+n;i=i+2){
            a3[i]=a1[j];
            a3[i+1]=a2[k];
            j++;
            k++;
            if(j==m)
                break;
            if(k==n)
                break;
        }
        i=i+2;
        if(n>m){
            for(p=j;p<n;p++){
                a3[i]=a2[p];
                i++;
            }
        }
        if(m>n){
            for(p=k;p<m;p++){
                a3[i]=a1[p];
                i++;
            }
        }
        System.out.println("Alternatively merged array:");
        for(i=0;i<(m+n);i++){
            System.out.println(a3[i]);
        }
    }
}
