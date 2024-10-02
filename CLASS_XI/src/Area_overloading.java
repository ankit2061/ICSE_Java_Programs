import java.util.*;
public class Area_overloading {
    void area(int s){
       int as=s*s;
        System.out.println("Area of the square: "+as+" sq. units");
    }
    void area(int l,int b){
        int ar=l*b;
        System.out.println("Area of the rectangle: "+ar+" sq. units");
    }
    void area(double r){
        double ac=  (3.14*r*r);
        System.out.println("Area of the circle: "+ac+" sq. units");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area_overloading ob=new Area_overloading();
        System.out.println("Enter 1 for finding the area of Square.");
        System.out.println("Enter 2 for finding the area of rectangle.");
        System.out.println("Enter 3 for finding the area of circle.");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter the length of the side of the square:");
                int s=sc.nextInt();
                ob.area(s);
                break;
            case 2:
                System.out.println("Enter the length and breadth of the rectabgle:");
                int l=sc.nextInt();
                int b=sc.nextInt();
                ob.area(l,b);
                break;
            case 3:
                System.out.println("Enter the radius of the circle:");
                double r=sc.nextInt();
                ob.area(r);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
