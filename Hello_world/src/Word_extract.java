import java.util.*;
public class Word_extract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        String word[]=s.split("[ ?,./]");
        int l= word.length;
        System.out.println("Total number of words:\t"+l);
        System.out.println("The words in the sentence are:");
        for(int i=0;i<l;i++){
            System.out.println(word[i]);
        }
    }
}
