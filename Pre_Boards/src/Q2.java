import java.util.*;
public class Q2 {
    int N, a[], b[][];

    Q2() {
        N = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        N = sc.nextInt();
        if (!(N > 2 && N < 10)) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        a = new int[N];
        b=new int[N][N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
    }
    void bubble_sort() {
        int temp = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < (N - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    void display_1(){
        for (int i = 0; i < N; i++) {
            System.out.println(a[i]+" ");
        }
    }
    void calc(){
        for (int i = N - 1, r = 0; i >= 0; i--, r++) {
            for (int j = 0; j <= i; j++) {
                b[r][j] = a[j];
            }
            for (int k = N - 1; k > i; k--) {
                b[r][k] = a[k - i - 1];
            }
        }
    }
    void display_2(){
        System.out.println("FILLED MATRIX:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q2 ob=new Q2();
        ob.input();
        ob.bubble_sort();
        ob.display_1();
        ob.calc();
        ob.display_2();
    }
}
