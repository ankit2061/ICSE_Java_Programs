import java.util.Scanner;

public class Day_no_given_future_date_findout
{
    int y,day,N;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        y=sc.nextInt();
        System.out.println("Enter the day number(must be between 1 and 366): ");
        day=sc.nextInt();
        if(day>366){
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("Enter the value of N,i.e.,date after the days(must be between 1 and 100):");
        N=sc.nextInt();
        if(N>100){
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    int leapyearcheck(){
        if((y%100==0&&y%400==0)||(y%4==0))
            return 1;
        else
            return 0;
    }
    void check() {
        int s = 0,m=0;
        int d[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (leapyearcheck() == 1)
            d[1] = 29;
        for(int i=0;i<(day/30);i++){
            s=s+d[i];
            m=i+2;
        }
        int date=day-s;
        System.out.println(date+"\\"+m+"\\"+y);
    }
    void display(){
        System.out.println("Date after "+N+" days after the given date is:");
        day=day+N;
        if(day<=366)
            check();
        else {
            y = y + 1;
            int total=0;
            if (leapyearcheck() == 1)
                total=366;
            else total=365;
            day=day-total;
            check();
        }
    }
    public static void main(String[] args) {
        Day_no_given_future_date_findout ob=new Day_no_given_future_date_findout();
        ob.input();
        ob.leapyearcheck();
        System.out.println("The date is: ");
        ob.check();
        ob.display();

    }
}
