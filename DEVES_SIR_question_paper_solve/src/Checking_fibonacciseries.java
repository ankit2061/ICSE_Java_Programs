/*Question:
AP to iput a number and check whether the number is present in Fibonacci series or not.
 */
import java.io.IOException;
import  java.io.*;
public class Checking_fibonacciseries {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());
        int a1 = 0;
        int a2 = 1;
        int a3 = 0;
        while (a3 < n) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        if (a3 == n) {
            System.out.println("It's in a fibonacci series");
        } else {
            System.out.println("It's not in a fibonacci series");
        }
    }
}
