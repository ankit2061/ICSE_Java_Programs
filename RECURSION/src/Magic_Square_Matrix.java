import java.util.*;
public class Magic_Square_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int a[]=new int[n*2+2];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                a[k]=mat[i][j];
                ++k;
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                {
                    a[k]=mat[i][j];
                }
                if((i+j)==(n-1)){
                    a[k]=mat[i][j];
                    k++;
                }
            }
        }
        int max=a[0],c=0;
        for(int i=1;i<k;i++){
            if(max!=a[i]){
                c=1;
                break;
            }
        }
        if(c==0)
        System.out.println("Magic_square matrix");
        else
            System.out.println("Not a Magic_square matrix");
    }
}
