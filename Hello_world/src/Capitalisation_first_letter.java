import java.util.*;
public class Capitalisation_first_letter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length(),i=0,j=0,k=0;
        char ch;
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' '){
                String s1=s.substring(j,i);
                int l1=s1.length();
                for(k=0;k<l1;k++){
                    System.out.print((s1.toUpperCase()).charAt(0)+(s1.toLowerCase()).substring(1)+" ");
                    break;
                }
                j=i+1;
            }
        }
    }
}
