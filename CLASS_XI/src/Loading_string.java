import java.util.*;
public class Loading_string {
    void stringload (String s, char ch1, char ch2){
        s=s.replace(ch1,ch2);
        System.out.println("New String: "+s);
    }
    void stringload (String s){
        int fs = s.indexOf(' ');
        int ls = s.lastIndexOf(' ');
        System.out.println("Index of the first space is: " + fs);
        System.out.println("Index of the last space is: " + ls);
    }
    void stringload ( String s1, String s2 ){
        String str = s1.concat(" ").concat(s2);
        System.out.println(str);
    }
    public static void main(String[] args) {
        Loading_string ob=new Loading_string();
        Scanner sc=new Scanner(System.in);
        Scanner cs=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.next();
        System.out.println("Enter the character you want to replace:");
        char c=sc.next().charAt(0);
        System.out.println("Enter the character you want to replace with:");
        char c1=sc.next().charAt(0);
        ob.stringload(s,c,c1);
        System.out.println("Enter a sentence:");
        String sss1 = cs.nextLine();
        ob.stringload(sss1);
        System.out.println("Enter two strings to concatenate:");
        String ss = sc1.nextLine();
        String ss1 = sc1.nextLine();
        ob.stringload(ss, ss1);
    }
}
