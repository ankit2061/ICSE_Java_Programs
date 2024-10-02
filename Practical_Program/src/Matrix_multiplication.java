import java.util.*;
public class Matrix_multiplication
{
    int a1[][],a2[][],r1,c1,r2,c2;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the first matrix:");
        r1=sc.nextInt();
        System.out.println("Enter the number of coloumns of the first matrix:");
        c1=sc.nextInt();
        a1=new int[r1][c1];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of the second matrix:");
        r2=sc.nextInt();
        System.out.println("Enter the number of coloumns of the second matrix:");
        c2=sc.nextInt();
        a2=new int[r2][c2];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                a2[i][j]=sc.nextInt();
            }
        }
    }
    void multiplication(){
        /*for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++)
                for(int k=0;k<(r1*c1);k++ )
        }*/
        if(r2!=c1) {
            System.out.println("Multiplication not possible");
            System.exit(0);
        }

        int C[][] = new int[r1][c2];

        // Multiply the two matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++)
                    C[i][j] += a1[i][k] * a2[k][j];
            }
        }
        System.out.println("The product of the two matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    void display()
    {
        System.out.println("The First matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Second matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix_multiplication ob=new Matrix_multiplication();
        ob.input();
        ob.display();
        ob.multiplication();
    }
}
