import java.util.*;
public class Only_First_letter_each_word {
    public static void main(String[] args) {
        int i=0,j=0,k=0,l=0,l1=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s+" ";
        l=s.length();
        String s1;
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' '){
                s1=s.substring(j,i);
                l1=s1.length();
                for(k=0;k<l1;k++){
                    System.out.print(s1.charAt(0)+" ");
                    break;
                }
                j=i+1;
            }
        }
    }
}
