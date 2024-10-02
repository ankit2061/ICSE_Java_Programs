/*
Question 6:
Write a program to input and store roll numbers, names and marks in 3 subjects of n number students
in five single dimensional array and display the remark based on average marks as given below :
(The maximum marks in the subject are 100)
 */
import java.util.*;
public class Paper2015_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0;
        double avg=0.0;
        String remarks="";
        System.out.println("Enter the number of students:");
        n=sc.nextInt();
        String name[]=new String[n];
        int Roll_no[]=new int[n];
        int s1[]=new int[n];
        int s2[]=new int[n];
        int s3[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the name of the student:");
            name[i]=sc.next();
            System.out.println("Enter the roll number of the student:");
            Roll_no[i]=sc.nextInt();
            System.out.println("Enter the marks of 3 subjects:");
            s1[i]= sc.nextInt();
            s2[i]= sc.nextInt();
            s3[i]= sc.nextInt();
        }
        for(i=0;i<n;i++){
            avg=(s1[i]+s2[i]+s3[i])/3;
            if(avg>=85)
                remarks="Excellent";
            if(avg>=75&&avg<=84)
                remarks="Distinction";
            if(avg>=60&&avg<=75)
                remarks="First Class";
            if(avg>=40&&avg<=59)
                remarks="Pass";
            if(avg<40)
                remarks="Poor";
            System.out.println("Name:\t"+name[i]+"\tRoll No.:\t"+Roll_no[i]+"\tRemarks:\t"+remarks);
        }
    }
}
