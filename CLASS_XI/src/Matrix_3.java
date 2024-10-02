/*
11.	Write a program to declare a matrix a[][] of order (M × N) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 20. Allow the user to input integers into this matrix. Perform the following tasks on the matrix:
Display the input matrix.
Find the maximum and minimum value in each row and each column of the matrix and display them.

 */
import java.util.*;
public class Matrix_3 {
    int M,N,a[][];
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        M=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        N=sc.nextInt();
        if(!(N>2&&M>2&&N<20&&M<20)){
            System.out.println("Invalid order of matrix");
            System.exit(0);
        }
        a=new int[M][N];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void max_min(){
        int max=0,min=0,maxc=0,minc=0,i=0,j=0;
        for(i=0;i<M;i++){
            max=a[i][0];
            min=a[i][0];
            maxc=a[0][i];
            minc=a[0][i];
            for(j=1;j<N;j++){
                if(a[i][j]>max)
                    max=a[i][j];
                if(a[i][j]<min)
                    min=a[i][j];
                if(a[j][i]>maxc)
                    maxc=a[j][i];
                if(a[j][i]<minc)
                    minc=a[j][i];
            }
            System.out.println("The Maximum value from row number "+(i+1)+" = "+max);
            System.out.println("The minimum value from row number "+(i+1)+" = "+min);
            System.out.println("The Maximum value from coloumn number "+(i+1)+" = "+maxc);
            System.out.println("The minimum value from coloumn number "+(i+1)+" = "+minc);
        }
    }
    void display(){
        System.out.println("The matrix:");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix_3 ob=new Matrix_3();
        ob.input();
        ob.display();
        ob.max_min();
    }
}
