package Exam_18_example_practice;
import java.util.*;
public class Reverse_array_pg_46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int i=0,a[]=new int[10];
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Reversed array:");
        for(i=9;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
