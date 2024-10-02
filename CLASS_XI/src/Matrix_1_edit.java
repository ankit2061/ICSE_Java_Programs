import java.util.*;
public class Matrix_1_edit {
    char m[][],b,c,nb;
    int n=0;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the size of the matrix:");
        n=sc.nextInt();
        if(n>3 && n<10)
            m=new char [n][n];
        else
        {
            System.out.println("out of range");
            System.exit(0);
        }
        System.out.println("Enter the corner element,boundary element and non-boundary element:");
        c=sc.next().charAt(0);
        b=sc.next().charAt(0);
        nb=sc.next().charAt(0);
    }
    void mat(){
        int i=0, j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==0||i==n-1)&&(j==0||j==n-1))
                    m[i][j]=c;
                else if(i==0||j==0||i==n-1||j==n-1)
                    m[i][j]=b;
                else
                    m[i][j]=nb;
            }
        }
    }
    void display(){
        int i=0,j=0;
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
    public static void main(String[] args) {
        Matrix_1_edit ob=new Matrix_1_edit();
        ob.input();
        ob.mat();
        System.out.println("The matrix:");
        ob.display();
    }
}
