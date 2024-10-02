import java.util.*;
public class BUZZ_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Choice:");
        System.out.println("Enter 1 for Checking if the number given by you is a Buzz number");
        System.out.println("Enter 2 to check if the number given by you is a Prime number");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the number ");
                int n=sc.nextInt();
                int n1;
                int d=0;
                while(n!=0){
                    d=n%10;
                    if(d==7)
                        System.out.println("");
                }
        }


    }
}
