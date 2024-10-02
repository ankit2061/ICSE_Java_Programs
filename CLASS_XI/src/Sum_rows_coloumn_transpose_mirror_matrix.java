import java.util.*;
public class Sum_rows_coloumn_transpose_mirror_matrix {
int a[][],r,c;
    void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        r=sc.nextInt();
        System.out.println("Enter the number of coloumns of the matrix:");
        c=sc.nextInt();
        a=new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        int i=0,j=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display_original(){
        int i=0,j=0;
        System.out.println("Original Matrix:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void sum_row(){
        int i=0,j=0,sr=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sr=sr+a[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row:"+sr);
            sr=0;
        }
    }
    void sum_coloumn(){
        int i=0,j=0,sc=0;
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                sc=sc+a[j][i];
            }
            System.out.println("Sum of "+(i+1)+" coloumn:"+sc);
            sc=0;
        }
    }
    void Transpose(){
        int i=0,j=0;
        System.out.println("Transpose of the Matrix:");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
    void Mirror(){
        int i=0,j=0;
        System.out.println("Mirror image of the Matrix:");
        for(i=0;i<c;i++){
            for(j=c-1;j>=0;j--){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Sum_rows_coloumn_transpose_mirror_matrix ob=new Sum_rows_coloumn_transpose_mirror_matrix();
        ob.Input();
        ob.display_original();
        ob.sum_row();
        ob.sum_coloumn();
        ob.Transpose();
        ob.Mirror();
    }
}
