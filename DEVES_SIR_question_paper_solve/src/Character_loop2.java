/*
Enter a String:
BLUEJ
BLUEJ
BLUE
BLU
BL
B
 */
import java.util.*;
public class Character_loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int i=0,j=0;
        char ch=' ';
        int l=s.length();
        for(i=l-1;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
