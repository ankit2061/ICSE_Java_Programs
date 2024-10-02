import java.util.*;
public class Sum_diagonals
{
    int a[][],M;
    void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        M=sc.nextInt();
        a=new int[M][M];
        System.out.println("Enter the elements of the matrix:");
        int i=0,j=0;
        for(i=0;i<M;i++){
            for(j=0;j<M;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display_original(){
        int i=0,j=0;
        System.out.println("Original Matrix:");
        for(i=0;i<M;i++){
            for(j=0;j<M;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void sum_diagonals(){
        int i=0,j=0,ld=0,rd=0;
        System.out.println("Original Matrix:");
        for(i=0;i<M;i++){
            for(j=0;j<M;j++){
                if(i==j)
                    ld+=a[i][j];
                if((i+j)==(M-1)){
                    rd=rd+a[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal= "+ld);
        System.out.println("Sum of right diagonal= "+rd);
    }
    public static void main(String[] args) {
        Sum_diagonals ob=new Sum_diagonals();
        ob.Input();
        ob.display_original();
        ob.sum_diagonals();
    }
}
