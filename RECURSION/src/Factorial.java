import java.util.Scanner;

public class Factorial {
    int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial of:");
        int f=sc.nextInt();
        System.out.println("The factorial of "+f+" is: "+fact(f));
    }

    public static void main(String[] args) {
        Factorial ob=new Factorial();
        ob.input();
    }
}
