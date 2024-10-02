import java.util.*;
public class Interchange_first_and_last_character_each_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String s1="";
        s=s+" ";
        int l=s.length();
        int i=0,j=0;
        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                s1=s.substring(j,i);
                System.out.print(s1.charAt(s1.length()-1)+s1.substring(1,s1.length()-1)+s1.charAt(0)+" ");
                j=i+1;
            }

        }
    }
}
