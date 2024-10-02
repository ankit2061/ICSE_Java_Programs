package ISC_2018;
/*
The names of the teams participating in a competition should be displayed on a banner vertically, to accommodate as many teams as possible in a single banner. Design a program to accept the names of N teams, where 2 < N < 9 and display them in vertical order, side by side with a horizontal tab (i.e. eight spaces).
 */
import java.util.*;
public class Q3_Vertical_names
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF N: ");
        int n = in.nextInt();
        in.nextLine();

        if (n <= 2 || n >= 9) {
            System.out.println("INVALID INPUT");
            return;
        }

        String teams[] = new String[n];
        int highLen = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Team " + (i+1) + ": ");
            teams[i] = in.nextLine();
            if (teams[i].length() > highLen) {
                highLen = teams[i].length();
            }
        }

        for (int i = 0; i < highLen; i++) {
            for (int j = 0; j < n; j++) {
                int len = teams[j].length();
                if (i >= len) {
                    System.out.print(" \t");
                }
                else {
                    System.out.print(teams[j].charAt(i) + "\t");
                }
            }
            System.out.println();
        }
    }
}
