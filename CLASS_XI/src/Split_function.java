import java.util.Scanner;
public class Split_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        String words[]=s.split(" ");
        System.out.println("The words of the string:");
        for(int i=0;i< words.length;i++)
            System.out.println(words[i]);
    }
}
