/*Two matrices are said to be equal if they have the same dimension and their corresponding elements are equal.

For example , the two matrices A and B given below are equal:

Matrix A                 Matrix B
1  2    3                     1   2     3
2   4   5                     2   4     5
3    5   6                    3     5    6
Design a class EqMat to check if tow matrices are equal or not. Assume that the two matrices have the same dimension.
Class name            :  EqMat
Data members:
a[][]                                        : to store integer elements
m, n                                        : to store the number of rows and columns
Member functions:
EqMat(int mm, int nn)             :  initialize the data members m=mm and n=nn
void readarray()                        :  to enter the elements in the array
int check(EqMat P, EqMat Q)  : checks if the parameterized objects P and Q are equal and returns 1 if true,otherwise returns 0.
void print()                                 : displays the array elements
Define the class and define main() to create objects and call the functions accordingly to enable the task.
*/
import java.util.*;
public class Eq_Mat {
    int a[][],m,n;
    Eq_Mat(int mm, int nn){
        m=mm;
        n=nn;
    }
    void readarray(){
        Scanner sc=new Scanner(System.in);
        a=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    int check(Eq_Mat P, Eq_Mat Q){
        int f=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(P.a[i][j]==Q.a[i][j])
                    f=1;
                else
                    f=0;
            }
        }
        return f;
    }
    void print(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the first array:");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns of the first array:");
        int c1=sc.nextInt();
        Eq_Mat ob1=new Eq_Mat(r1,c1);
        System.out.println("Enter the number of rows of the second array:");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns of the second array:");
        int c2=sc.nextInt();
        Eq_Mat ob2=new Eq_Mat(r2,c2);
        if((r1==r2)&&(c1==c2)){
            System.out.println("Enter the elements of the first matrix:");
            ob1.readarray();
            System.out.println("First Array:");
            ob1.print();
            System.out.println("Enter the elements of the second matrix:");
            ob2.readarray();
            System.out.println("Second array:");
            ob2.print();
            int f= ob1.check(ob1,ob2);
            if(f==1)
                System.out.println("Equal Matrix");
            else
                System.out.println("Unequal Matrix");
        }
        else
            System.out.println("Unequal Matrix");
    }
}
