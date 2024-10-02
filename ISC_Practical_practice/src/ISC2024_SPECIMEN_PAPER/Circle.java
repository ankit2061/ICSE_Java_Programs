package ISC2024_SPECIMEN_PAPER;
import java.util.*;
public class Circle {
    double radius,area;
    Circle(double r,double a){
        radius=r;
        area=a;
    }
    void Cal_area(){
        area=3.14*radius*radius;
    }
    void display(){
        System.out.println("Area of the circle: "+area);
    }

}
