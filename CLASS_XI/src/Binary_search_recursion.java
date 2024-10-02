import java.util.Scanner;
public class Binary_search_recursion {
    int a[];
    static int n;
    Binary_search_recursion(int nn){
        n=nn;
        a=new int[n];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    int Bin_srch(int x,int l,int h) {
        //int mid = 0;
        if (l <= h) {
            int mid = l + h / 2;
            if (x == a[mid])
                return mid;
            else if (x > a[mid])
                return Bin_srch(x, (mid + 1), h);
            else
                return Bin_srch(x, l, mid - 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int nnn=sc.nextInt();
        Binary_search_recursion obj=new Binary_search_recursion(nnn);
        obj.input();
        System.out.println("Enter the element to be searched:");
        int s=sc.nextInt();
        int bs=obj.Bin_srch(s,0,(n-1));
        if(bs==-1)
            System.out.println("ELement not present");
        else
            System.out.println("Element present at index "+bs);
    }
}
