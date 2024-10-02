import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="I am ankit?";
        int l=s.length();
        s=s.substring(0,l);
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }

    }

}
