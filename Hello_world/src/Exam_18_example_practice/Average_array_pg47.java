package Exam_18_example_practice;
import java.util.*;
public class Average_array_pg47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int i=0,a[]=new int[10],sum=0;
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        double avg=sum/10.0;
        System.out.println("Average = "+avg);
    }
}
