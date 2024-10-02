import java.util.*;
public class Uppercasevowel_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ten characters:");
        int i=0,uc=0,vc=0;
        char a[]=new char[10];
        for(i=0;i<10;i++){
            a[i]=sc.next().charAt(0);
        }
        for(i=0;i<10;i++){
            for(char ch='A';ch<='Z';ch++){
                if(a[i]==ch)
                    uc++;
            }
        }
        for(i=0;i<10;i++){
            if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='A'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
                vc++;
            }
        System.out.println("Number of upper case letters= "+uc);
        System.out.println("Number of vowels= "+vc);
    }
}
