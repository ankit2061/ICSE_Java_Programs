import java.util.*;
public class MinMax_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter the number of coloumns :");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int i=0,j=0;
        System.out.println("Enter the elements of the array:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int max=0,min=0,maxc=0,minc=0;
        for(i=0;i<r;i++){
            max=a[i][0];
            min=a[i][0];
            maxc=a[0][i];
            minc=a[0][i];
            for(j=1;j<c;j++){
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
}
