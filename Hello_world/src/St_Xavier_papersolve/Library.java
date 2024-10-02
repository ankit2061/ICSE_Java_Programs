//the program has error
package St_Xavier_papersolve;
import java.util.*;
public class Library {
    String name,author;
    double p,f;
    int d;
    public Library(){
        name="";
        author="";
        p=0.0;
        f=0.0;
        d=0;
    }
    void fine(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        name= sc.nextLine();
        System.out.println("Enter the author of the book:");
        author= sc.nextLine();
        System.out.println("Enter the price of the book:");
        p=sc.nextDouble();
        System.out.println("Enter the number of days the book is taken for:");
        d= sc.nextInt();
        if(d>7){
           int d1=d-7;
           if(d1<=5)
               f=2.00;
           if(d1>5 && d<=10)
               f=3.00;
           if(d1>10)
                f=5.00;
           f=f*d1;
        }
        else
            f=0;
    }
    void display(){
        System.out.println("Name of the book:\t"+name);
        System.out.println("Author of the book:\t"+author);
        System.out.println("Days for which the book was taken:\t"+d);
        System.out.println("Fine charged:\t"+f);
        p=((0.02*p)*d)+f;
        System.out.println("Total amount to be paid:\t"+p);
    }
    public static void main(String[] args) {
        Library ob=new Library();
        ob.fine();
        ob.display();
    }
}
