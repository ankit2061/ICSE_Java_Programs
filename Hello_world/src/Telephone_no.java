import java.util.*;
public class Telephone_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=20;
        String names[]=new String[n];
        long telno[]=new long[n];
        int i=0;
        for(i=0;i<n;i++){
            System.out.println("Enter the name of the Student:");
            names[i]=sc.next();
            System.out.println("Enter the telephone number of that student:");
            telno[i]= sc.nextLong();
        }
        System.out.println("Enter the name of the student whose telephone number you want to search:");
        String search=sc.next();
        int s=0,c=0;
        for(i=0;i<n;i++){
            if(search.equalsIgnoreCase(names[i])){
                s=i;
                c++;
                break;
            }
        }
        if(c>0)
            System.out.println("Telephone number: "+telno[i]);
        else
            System.out.println("Name not found");

    }
}
