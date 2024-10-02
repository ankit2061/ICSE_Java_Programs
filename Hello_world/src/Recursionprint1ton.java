import java.util.Scanner;

public class Recursionprint1ton
{
    static int c=1,n=0;
    void Printing(){
        if(c>n){
            return;
        }
        System.out.println(c);
        c++;
        Printing();
    }
    public static void main(String[] args) {
        Recursionprint1ton ob=new Recursionprint1ton();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number until which you want to print to print it:");
        n=sc.nextInt();
        ob.Printing();
    }
}
