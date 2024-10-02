import java.util.*;
public class Syntax_of_scanner_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String s=sc.nextLine();
        System.out.println("Enter your class and roll no:");
        int class_name=sc.nextInt();
        int roll_no=sc.nextInt();
        System.out.println("Your name: "+s);
        System.out.println("Your class: "+class_name);
        System.out.println("Your roll no.: "+roll_no);
    }
}
