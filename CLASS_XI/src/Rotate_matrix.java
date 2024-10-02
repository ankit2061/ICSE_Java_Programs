import java.util.*;
public class Rotate_matrix {
    int a[][], r, c;
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        r = sc.nextInt();
        System.out.println("Enter the number of coloumns of the matrix:");
        c = sc.nextInt();
        a = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        int i = 0, j = 0;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display_original() {
        int i = 0, j = 0;
        System.out.println("Original Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void rightRotate() {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

    }
    void print_right(){
        System.out.println("The Right Rotated Matrix is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" " +"\t");
            }
            System.out.println();
        }
    }

    void leftRotate() {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < c; i++) {
            int low = 0;
            int high = c - 1;
            while (low < high) {
                int temp = a[low][i];
                a[low][i] = a[high][i];
                a[high][i] = temp;
                low++;
                high--;
            }
        }
    }
    void print_left(){
        System.out.println("Matrix After Left Rotation: ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[i][j]+" "+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rotate_matrix ob=new Rotate_matrix();
        ob.Input();
        ob.display_original();
        ob.rightRotate();
        ob.print_right();
        ob.print_left();
    }

}
