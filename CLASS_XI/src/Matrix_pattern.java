import java.util.*;
public class Matrix_pattern
{
    int a[][],m;
    void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        m=sc.nextInt();
        a=new int[m][m];
        System.out.println("Enter the elements of the matrix:");
        int i=0,j=0;
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display_original(){
        int i=0,j=0;
        System.out.println("Original Matrix:");
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void Z(){
        System.out.println("Z:");
        for(int i=0;i<m-1;i++){
            System.out.print(a[0][i]+"\t");
            System.out.print(a[i][m - i - 1]+"\t");
            System.out.print(a[m - 1][i]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix_pattern ob=new Matrix_pattern();
        ob.Input();
        ob.display_original();
        ob.Z();
    }
}
