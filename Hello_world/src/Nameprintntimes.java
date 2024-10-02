import java.util.*;
public class Nameprintntimes {
    static int c=0,n=0;
    static String name;
    void Printing(){
        if(c>=n)
            return;
        System.out.println(name);
        c++;
        Printing();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter the number of times you want to print it:");
        n=sc.nextInt();
        Nameprintntimes ob=new Nameprintntimes();
        System.out.println("Name printed "+n+" times:");
        ob.Printing();
    }
}
