/*QUESTION:
Enter a String:
BLUEJ
B
BL
BLU
BLUE
BLUEJ
 */
import java.util.*;
public class Character_loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int i=0,j=0;
        char ch=' ';
        int l=s.length();
        for(i=0;i<l;i++){
            for(j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
