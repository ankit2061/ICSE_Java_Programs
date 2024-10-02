package Exam_18_Practice_paper1;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Assign a full path and file name:");
        String path=sc.next();
        path=path.concat("\\");
        int i=0,j=0,k=0,c=0;
        for(i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='\\'){
                c++;
                String s1=path.substring(j,i);
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
