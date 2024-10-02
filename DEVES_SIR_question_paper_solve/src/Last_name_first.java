/*Question:
WAP to input a name including middle name and
print the name first surname and then name with middle name
 */
import java.util.*;
public class Last_name_first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name,i.e, with name,middle name and surname:");
        String full_name=sc.nextLine();
        int last_str = full_name.lastIndexOf(' ');
        String surname = full_name.substring(last_str + 1);
        String first_str = full_name.substring(0, last_str);
        System.out.println("Name with surname first:\t"+surname + " " + first_str);
    }
}
