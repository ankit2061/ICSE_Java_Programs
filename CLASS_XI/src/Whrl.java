import java.util.*;
public class Whrl {
    int m,n;
    int a[][];
    int arr[][];
    static Scanner sc=new Scanner(System.in);
    void create(){
        System.out.println("Enter the number of rows and columns of the matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m][n];
        arr=new int[m][n];
    }
    void input(){
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display_original(){
        System.out.println("Original Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void calc(){
        for(int i=0;i<m;i++) {
            if(i%2==0){
                arr[i][0]=a[i][n-1];
                int k=1;
                for(int j=0;j<n-1;j++){
                    arr[i][k]=a[i][j];
                    k++;
                }
            }
            else {
                arr[i][n-1]=a[i][0];
                int k=1;
                for (int j = 0; j < n-1; j++) {
                    arr[i][j]=a[i][k];
                    k++;
                }
            }
        }
    }
    void display(){
        System.out.println("Circular Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Whrl ob=new Whrl();
        ob.create();
        ob.input();
        ob.display_original();
        ob.calc();
        ob.display();
    }
}
