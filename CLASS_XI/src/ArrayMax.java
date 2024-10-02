import java.util.*;
public class ArrayMax {
    int arr[][];
    int m;
    static Scanner sc=new Scanner(System.in);
    ArrayMax(int mm){
        m=mm;
        arr=new int[m][m];
    }
    void readarray(){
        System.out.println("Enter the array elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void large() {
        int max = 0;
        for (int i = 0; i < m; i++) {
            max = arr[i][0];
            for (int j = 1; j < m; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println("Largest element of "+(i+1)+" row is: "+max);
        }
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the order of the matrix:");
        int o=sc.nextInt();
        ArrayMax ob=new ArrayMax(o);
        ob.readarray();
        ob.display();
        ob.large();
    }
}
