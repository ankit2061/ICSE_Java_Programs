import java.util.*;
public class Saddle_point {
    int a [][],r,c;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        r=sc.nextInt();
        System.out.println("Enter the number of coloumns of the matrix:");
        c=sc.nextInt();
        a=new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    void Original_Matrix(){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void check(){
        int min=0,c=0,p=0;
        for(int i=0;i<r;i++){
            min=a[i][0];
            c=0;
            for(int j=0;j<c;j++){
                if(min>a[i][j]){
                    min=a[i][j];
                    p=j;
                }
            }
            for(int k=0;k<r;k++) {
                if (min < a[k][p]) {
                    c = 1;
                    break;
                }
            }
        }
        if(c==0) {
            System.out.println("Saddle Point: " + min);
            System.exit(0);
        }
        System.out.println("No Saddle point");
    }

    public static void main(String[] args) {
        Saddle_point ob=new Saddle_point();
        ob.input();
        ob.Original_Matrix();
        ob.check();
    }
}
