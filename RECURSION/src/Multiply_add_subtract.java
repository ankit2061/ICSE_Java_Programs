import java.util.*;
public class Multiply_add_subtract {
    int a1[][],a2[][];
    static int r1,r2,c1,c2;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix:");
        r1=sc.nextInt();
        c1=sc.nextInt();
        a1=new int[r1][c1];
        System.out.println("Enter the number of rows and columns of the second matrix:");
        r2=sc.nextInt();
        c2=sc.nextInt();
        a2=new int[r2][c2];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                a2[i][j]=sc.nextInt();
            }
        }
    }
    void display_original() {
        System.out.println("First Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
    }
    void multiply(){
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++)
                    c[i][j]+=a1[i][k]*a2[k][j];
            }
        }
        System.out.println("The multiplied matrix:");
        for(int i=0;i<r1;i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    void add(){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                int s=a1[i][j]+a2[i][j];
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    void diff(){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                int d=a1[i][j]-a2[i][j];
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Multiply_add_subtract ob=new Multiply_add_subtract();
        ob.input();
        ob.display_original();
        if(r2==c2){
            ob.multiply();
        }
        else
            System.out.println("Multiplication not possible");
        if(r1==r2&&c1==c2) {
            System.out.println("Sum of the matrix:");
            ob.add();
            System.out.println("Difference of the matrix:");
            ob.diff();
        }

    }
}
