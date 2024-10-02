/**This computer program is written by Ankit Talukder
 * The Question for the program is given in ICSE 2014 Question Paper
 */
import java.util.*;
public class Banking//Question 8
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.\tTerm Deposit");
        System.out.println("2.\tRecurring Deposit");
        int ch=sc.nextInt();
        double P,r,n,A=0.0;
        switch(ch){
            case 1:
                System.out.println("Enter Principal,rate of interest,time period in years:");
                P=sc.nextDouble();
                r=sc.nextDouble();
                n=sc.nextDouble();
                A=P*Math.pow((1+(r/100)),n);
                System.out.println("Maturity amount= Rs."+A);
                break;
            case 2:
                System.out.println("Enter Monthly Installment,rate of interest,time period in months:");
                P=sc.nextDouble();
                r=sc.nextDouble();
                n=sc.nextDouble();
                double I=P*((n*(n+1))/(2*12))*(r/100);
                A=P*n+I;
                System.out.println("Maturity amount= Rs."+A);
                break;
            default:
                System.out.println("Choose either option 1 or 2");
                System.out.println("Try again!!!");
        }
    }
}
