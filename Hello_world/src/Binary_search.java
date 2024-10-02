import java.util.*;
class Binary_search{
    static int a[];
    void bsearch(int n){
        int flag=0,L,U,M=0;
        L=0;
        U=9;
        while(L<=U){
            M=(L+U)/2;
            if(n>a[M])
                L=M+1;
            else if (n<a[M]) {
                U=M=1;
            }
            else {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Element present at position "+(M+1));
        else
            System.out.println("Element not present");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pockets of the array:");
        int n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the Integers:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the value to search:");
        int search=sc.nextInt();
        Binary_search ob=new Binary_search();
        ob.bsearch(search);
    }
}