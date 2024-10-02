import java.util.*;
public class Second_smallest_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pockets of the array:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" integers:");
        int a[]=new int[n],i=0,p=0,min=0,max=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        min=a[0];
        max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min) {
                min = a[i];
                p=i;
            }
        }
        System.out.println("Lowest value: "+min);
        a[p]=max;
        min=a[0];
        for(i=0;i<n;i++){
            if(a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("Second lowest value: "+min);
    }
}


