import java.util.*;
public class Second_highest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pockets of the array:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" integers:");
        int a[]=new int[n],i=0,p=0,max=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=0;i<n;i++){
            if(a[i]>max) {
                max = a[i];
                p=i;
            }
        }
        System.out.println("Highest value: "+max);
        a[p]=0;
        max=0;
        for(i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Second highest value: "+max);
    }
}
