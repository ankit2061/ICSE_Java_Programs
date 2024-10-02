import java.util.*;
public class Matrix_algebra
{
    static int m,n,mm,nn;
    int a[][];
    int arr[][];
    int prod[][];
    int sum[][];
    int Sub[][];

    static Scanner sc=new Scanner(System.in);
    void create(){
        System.out.println("Enter the number of rows and columns of the first matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[m][n];
        System.out.println("Enter the number of rows and columns of the second matrix:");
        mm=sc.nextInt();
        nn=sc.nextInt();
        arr=new int[mm][nn];
    }
    void input(){
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<mm;i++){
            for(int j=0;j<nn;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void print_display(int m[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    void display_original(){
        System.out.println("First matrix:");
        print_display(a,m,n);
        System.out.println("Second matrix:");
        print_display(arr,mm,nn);
    }
    void Mult(){
            prod = new int[m][nn];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < nn; j++) {
                    for (int k = 0; k < mm; k++)
                        prod[i][j] += a[i][k] * arr[k][j];
                }
            }
            System.out.println("Product Matrix:");
            print_display(prod, m, nn);
    }
    void add(){
            sum=new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    sum[i][j] = a[i][j] + arr[i][j];
            System.out.println("Sum:");
            print_display(sum,m,n);
    }
    void diff(){
        if(m==mm && n==nn){
            Sub =new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    Sub[i][j] = a[i][j] - arr[i][j];
            System.out.println("Difference:");
            print_display(Sub,m,n);
        }
        else System.out.println("Subtraction not possible");
    }
    public static void main(String[] args) {
        Matrix_algebra ob=new Matrix_algebra();
        System.out.println("Enter (1) for Multiplication:");
        System.out.println("Enter (2) for Addition:");
        System.out.println("Enter (3) for Subtraction:");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                ob.create();
                if(n==mm) {
                    ob.input();
                    ob.display_original();
                    ob.Mult();
                }
                else System.out.println("Multiplication not possible");
                break;
            case 2:
                ob.create();
                if(m==mm && n==nn) {
                    ob.input();
                    ob.display_original();
                    ob.add();
                }
                else System.out.println("Addition not possible");
                break;
            case 3:
                ob.create();
                if(m==mm && n==nn) {
                    ob.input();
                    ob.display_original();
                    ob.diff();
                }
                else System.out.println("Addition not possible");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}
