import java.util.*;
public class Word_extraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        s=s+" ";
        int i=0,l=s.length(),j=0,k=0;
        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                String s1=s.substring(j,i);
                int l1=s1.length();
                System.out.println(s1);
                for(k=0;k<l1;k++){
                    //here you have to do whats ur purpose
                }
                j=i+1;
            }
        }
    }
}
