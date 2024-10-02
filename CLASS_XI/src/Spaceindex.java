import java.util.*;
public class Spaceindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= sc.nextLine();
        int f=s.indexOf(' ');
        int l=s.lastIndexOf(' ');
        System.out.println("Index of first space: "+f);
        System.out.println(" Index of last space: "+l);;
    }
}
