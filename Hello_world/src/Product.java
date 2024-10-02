import java.util.*;
public class Product {
    int pno,qnty;
    String name;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product number");
        pno=sc.nextInt();
        System.out.println("Enter the product name");
        name=sc.nextLine();
    }
    void show(){
        System.out.println("Product Number:"+pno);
        System.out.println("Product Name:"+name);
    }
    class Sale extends Product{
        double rate,amount;
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the rate:");
            rate=sc.nextInt();
        }
        void calculate(){
            amount=rate*qnty;
        }
        void display(){
            System.out.println("Amount to be paid:"+amount);
        }
    }
}
