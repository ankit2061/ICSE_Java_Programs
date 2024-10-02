import java.util.*;
public class Convert {
    int n,d,m,y;
    Convert(){
        n=0;//day no
        d=0;//date
        m=0;//month
        y=0;//year
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number and the year:");
        n=sc.nextInt();
        y=sc.nextInt();
    }
    void day_to_date(){
        int day[]={31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31 };
        if(y%4==0||y%100==0)//leap year check
            day[1]=day[1]+1;
        int i=0;
            while(d<=n){
                d+=day[i];
                i++;
                m=i;
            }
            d=n-(d-day[m])+1;
    }
    void display(){
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Month: "+month[m-1]+"\n"+"Date: "+d+"\n"+"Year: "+y);
    }
    public static void main(String[] args) {
        Convert ob=new Convert();
        ob.accept();
        ob.day_to_date();
        ob.display();
    }
}
