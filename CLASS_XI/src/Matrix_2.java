import java.util.*;
public class Matrix_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the order of the matrix:");
        int o=sc.nextInt();
        int a[][]=new int[o][o];
        System.out.println("Enter the elements of the matrix:");
        int i=0,j=0;
        for(i=0;i<o;i++){
            for(j=0;j<o;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix:");
        for(i=0;i<o;i++){
            for(j=0;j<o;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int s=0,s1=0,ld=0,rd=0;
        for(i=0;i<o;i++){
            for(j=0;j<o;j++){
                s=s+a[i][j];
                s1=s1+a[j][i];
                if(i==j)
                    ld=ld+a[i][j];
                if((i+j)==(o-1))
                    rd=rd+a[i][j];
            }
            System.out.println("Sum of elements of row "+(i+1)+" = "+s);
            System.out.println("Sum of elements of each coloumn = "+s1);
            s=0;s1=0;
        }
        System.out.println("Sum of left diagonal elements= "+ld);
        System.out.println("Sum of right diagonal elements= "+rd);
    }
}
