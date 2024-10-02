package Exam_18_example_practice;
import java.util.*;
public class Min_max_page_48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int a[]=new int[10],i=0,min=0,max=0;
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        min=a[0];
        max=a[0];
        for(i=0;i<10;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
    }
}
