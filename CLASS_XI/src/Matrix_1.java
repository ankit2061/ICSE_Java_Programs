import java.util.*;
public class Matrix_1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the square matrix");
        int n=sc.nextInt();
        if(n>3 && n<10)
        {
            char m[][]=new char [n][n];
            int i=0, j=0;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if((i==0||i==n-1)&&(j==0||j==n-1))
                        m[i][j]='@';
                    else if(i==0||j==0||i==n-1||j==n-1)
                        m[i][j]='?';
                    else
                        m[i][j]='#';
                }
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(m[i][j]);
                    System.out.print("\t");
                }
                System.out.print("\n");
            }
        }
        else
            System.out.println("out of range");
    }
}
