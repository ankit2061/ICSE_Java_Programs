import java.util.*;
public class Frequency_each_element {
    public static void main(String[] args) {

            System.out.println("Enter the number of elements in the array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            int i = 0, j = 0;
            System.out.println("Enter the elements of array");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {

                if (a[i] == 0)
                    continue;
                int c=1;
                for (j = i+1; j < n; j++) {
                    if (a[i] == a[j]) {
                        c++;
                        a[j] = 0;
                    }
                }
                if (c > 0)
                    System.out.println(a[i] + " present in " + c + " times");
            }
        }
    }
