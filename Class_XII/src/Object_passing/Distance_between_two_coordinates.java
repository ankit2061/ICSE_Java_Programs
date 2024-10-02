package Object_passing;
import java.util.*;
public class Distance_between_two_coordinates {
    double x,y=0;
    double distance;
    /*Distance_between_two_coordinates(double x_v,double y_v){
        x=x_v;
        y=y_v;
        distance=0.0;
    }*/
    Distance_between_two_coordinates(){
        x=0.0;
        y=0.0;
        distance=0.0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the co-ordinates(values of x & y):");
        double xx=sc.nextDouble();
        double yy=sc.nextDouble();

    }
    Distance_between_two_coordinates Dis(Distance_between_two_coordinates B){
        Distance_between_two_coordinates D=new Distance_between_two_coordinates();
        D.x=Math.pow((this.x-B.x),2);
        D.y=Math.pow((this.y-B.y),2);
        double sum=D.x+D.y;
        D.distance=Math.sqrt((sum));
        return D;
    }
    void Display(){
        System.out.println("Distance between the two coordinates: "+this.distance);
    }
    public static void main(String[] args) {
        Distance_between_two_coordinates ob1=new Distance_between_two_coordinates();
        Distance_between_two_coordinates ob2=new Distance_between_two_coordinates();
        Distance_between_two_coordinates ob3=new Distance_between_two_coordinates();
        ob1.accept();
        ob2.accept();
        ob3=ob2.Dis(ob1);
        ob3.Display();

    }
}
