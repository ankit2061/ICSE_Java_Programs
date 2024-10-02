/*
A line on a plane can be represented by
coordinates of the two end points p1 and p2 as p1(x1, y1)
and p2(x2, y2).
A super class Plane is defined to represent a line and a
subclass Circle to find the length of the radius and the
area of circle by using the required data members of
super class.
Some of the members of both the classes are given
below:
Class name: Plane
Data members/instance variables:
x1: to store the x-coordinate of the first end point. y1:
to store the y-coordinate of the first end point.
Member functions/methods:
Plane(int x, int y): parameterized constructor to assign
the data members x1 = x and y1 = y. void show(): to
display the coordinates.
Class name: Circle
Data members/instance variables:
x2: to store the x-coordinate of the second end point. y2:
to store the y-coordinate of the second end point.
radius: double variable to store the radius of the circle.
area: double variable to store the area of the circle.
Member functions/methods:
Circle(...): parameterized constructor to assign values to
data members of both the classes.
void findRadius(): to calculate the length of radius using
the formula:
(√ ((x2 – x1)2 + (y2 – y1)2)) / 2 assuming that x1, x2, y1,
y2 are the coordinates of the two ends of the diameter
of a circle. void findArea(): to find the area of circle

using formula: πr2. The value of pie (π) is 22 / 7 or
3.14.
void show(): to display both the coordinates along with
the length of the radius and area of the circle. Specify
the class Plane giving details of the constructor and
void show(). Using the concept of inheritance, specify
the class Circle giving details of the constructor, void
findRadius(), void findArea() void show(). Also write the main() function.
 */
import  java.util.*;
public class Plane {
int x1,y1;
Plane(int x,int y){
    x1=x;
    y1=y;
}
void show(){
    System.out.println("First X coordinate: "+x1);
    System.out.println("First Y coordinate: "+y1);
}
}
class Circle extends Plane{
    int x2,y2;
    double radius,area;
    Circle(int a,int b,int c,int d){
        super(a,b);
        x2=c;
        y2=d;
    }
    void findRadius(){
        //radius= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) /2;
        radius=(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))/2;
    }
    void findArea(){
        area=3.14*radius*radius;
    }
    void show(){
        super.show();
        findRadius();
        findArea();
        System.out.println("Second X coordinate: "+x2);
        System.out.println("Second Y coordinate: "+y2);
        System.out.println("Radius: "+radius+" units");
        System.out.println("Area: "+area+" sq. units");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first coordinates:");
        int X1=sc.nextInt();
        int Y1=sc.nextInt();
        System.out.println("Enter the second coordinates:");
        int X2=sc.nextInt();
        int Y2=sc.nextInt();
        Circle ob=new Circle(X1,Y1,X2,Y2);
        ob.show();
    }
}
