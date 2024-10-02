import java.util.*;
public class Same_year_two_dates_total_days {
    int y,d1,d2,m1,m2;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        y=sc.nextInt();
        System.out.println("Enter the day and the month of the first date: ");
        d1=sc.nextInt();
        m1=sc.nextInt();
        System.out.println("Enter the day and the month of the second date: ");
        d2=sc.nextInt();
        m2=sc.nextInt();
    }
    int leapyearcheck(){
        if((y%100==0&&y%400==0)||(y%4==0))
            return 1;
        else
            return 0;
    }
    void check(){
       int s=0;
       int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
       if(leapyearcheck()==1)
           d[1]=29;
        for(int i=m1;i<(m2-1);i++){
            s=s+d[i];
        }
        s=s+d[m1-1]-d1;
        s=s+d2;
        System.out.println("Difference of days :"+ s);
    }
    public static void main(String[] args) {
        Same_year_two_dates_total_days ob=new Same_year_two_dates_total_days();
        ob.input();
        ob.check();
    }
}
