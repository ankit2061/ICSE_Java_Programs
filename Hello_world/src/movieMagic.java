/**This computer program is written by Ankit Talukder
 * The Question for the program is given in ICSE 2014 Question Paper
 */
import java.util.*;
public class movieMagic //ICSE 2014 Question 4
{
    int year;
    String title;
    float rating;
    public movieMagic(){
        year=0;
        title="";
        rating=0.0f;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title of the movie:");
        title=sc.nextLine();
        System.out.println("Enter the year of release of the movie");
        year=sc.nextInt();
        System.out.println("Enter the rating of the movie");
        rating=sc.nextFloat();
    }
    void display(){
        System.out.println("Title:\t"+title);
        System.out.println("Year:\t"+year);
        System.out.print("Status:\t");
        if(rating<=2.0)
            System.out.println("Flop");
        if(rating>2.0 && rating<3.5)
            System.out.println("Semi-hit");
        if(rating>=3.5 && rating<4.6)
            System.out.println("Hit");
        if(rating>=4.6 && rating<=5.0)
            System.out.println("Super-hit");
    }

    public static void main(String[] args) {
        movieMagic ob=new movieMagic();
        ob.accept();
        ob.display();
    }
}
