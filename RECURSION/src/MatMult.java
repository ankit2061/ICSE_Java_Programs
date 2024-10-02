import java.util.*;
class Matmult
{
    public static void main(String args[])
    {
        int a[][],b[][],c[][];
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column number of matrix1");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the row and column number of matrix2");
        r2=sc.nextInt();
        c2=sc.nextInt();
        a=new int[r1][c1];
        b=new int[r2][c2];
        if(c1==r2)
        {
            c=new int[r1][c2];
            System.out.println("Enter the elements of matrix1");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                    a[i][j]=sc.nextInt();
            }
            System.out.println("Enter the elements of matrix2");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                    b[i][j]=sc.nextInt();
            }
            System.out.println("Matrix1:");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                    System.out.print(a[i][j]+" ");
                System.out.println();
            }
            System.out.println("Matrix2:");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                    System.out.print(b[i][j]+" ");
                System.out.println();
            }
            for(int i=0;i<r1;i++)
            {
                for(int k=0;k<c2;k++)
                {
                    c[i][k]=0;
                    for(int j=0;j<c1;j++)
                    {
                        c[i][k]+=(a[i][j]*b[j][k]);
                    }
                }
            }
            System.out.println("Product Matrix:");
            for(int i=0;i<r1;i++)
            {
                for(int k=0;k<c2;k++)
                    System.out.print(c[i][k]+" ");
                System.out.println();
            }
        }
        else
            System.out.println("Multiplication not possible");
    }
}