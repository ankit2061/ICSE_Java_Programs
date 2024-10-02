package Don_Bosco;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[10];
        int f[]=new int[10];
        int i=0,j=0;
        System.out.println("Enter 10 numbers:");
        for(i=0;i<10;i++){
            a[i]=sc.next();
            f[i]=a[i].length();
        }
        int c=0;
        for(i=0;i<10;i++){
            if(f[i]==2)
                c++;
        }
        String a1[]=new String[c];
        for(i=0;i<10;i++){
            if (f[i] == 2) {
                    a1[j] = a[i];
                    j++;

            }
        }
        int c1=0;
        for(i=0;i<c;i++){
            for(j=0;j<c;j++){
                if(a1[i].equals(a1[j])){
                    c1++;
                }
            }
            System.out.println("Frequency of "+a1[i]+" is:"+c1);
            c1=0;

        }
    }
}
