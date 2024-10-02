import java.util.*;
public class Lexicography {
    public static void main(String args[])
    {
        String s,s1="";
        int i,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        String a[]=new String[l/2];
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                a[k++]=s.substring(j,i);
                j=i+1;
            }
        }
        for(i=0;i<k-1;i++)
        {
            for(j=0;j<k-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    s1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=s1;
                }
            }
        }
        System.out.println("the lexicographical words of string");
        for(i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
