/*
Question 4
Define a class to declare an array of size 20 of double datatype, accept the elements into
the array and perform the following:
• Calculate and print the sum of all the elements.
• Calculate and print the highest value of the array.
 */
import java.util.*;
public class Sem2_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[20];
        System.out.println("Enter the elements of the array:");
        int i=0;
        for(i=0;i<20;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0];
        double s=0.0;
        for(i=0;i<20;i++){
            s=s+arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Sum of the 20 elements= "+s);
        System.out.println("Highest value of the array= "+max);

    }
}
