import java.util.*;
public class Only_initials_surname_full {
    public static void main(String[] args) {
        String s, s1, s2;
        int i = 0, j = 0, k = 0, l = 0, indl = 0, indf = 0,l1=0;
        char ch, ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l-1;i++){
            ch=s.charAt(i);
            if(ch==' '){
                s1=s.substring(j,i);
                l1=s1.length();
                for(k=0;k<l1;k++){
                    System.out.print(s1.charAt(0)+". ");
                    break;
                }
                j=i+1;
            }
        }
        System.out.print(s.substring(s.lastIndexOf(' ')+1));
    }
}

