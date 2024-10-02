import java.util.*;
public class WORDS_WITH_REPEATEDCHARACTERS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        s=s+" ";
        String s1="",s2="";
        int l=s.length();
        int i=0,j=0,k=0,p=0;
        for(i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                s1=s.substring(j,i);
                int l1=s1.length();
                for(k=0;k<l1;k++){
                    char ch1=s1.charAt(k);
                    for(p=k+1;p<l1;p++){
                        if(ch1==s1.charAt(p)){
                            break;
                        }
                    }
                    if(p<l1) {
                        System.out.println(s1);
                        break;
                    }
                }
                s1="";
                j=i+1;
            }
        }
    }
}
