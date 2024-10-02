import java.util.*;
public class Birthday_day_no {
    static int y,d1,d2,m1,m2;
    void input(){
        Scanner sc=new Scanner(System.in);
        d1=1;
        m1=1;
        System.out.println("Enter your date of birth in dd/mm/yy format: ");
        d2=sc.nextInt();
        m2=sc.nextInt();
        y=sc.nextInt();
    }
    int leapyearcheck(){
        if((y%100==0&&y%400==0)||(y%4==0))
            return 1;
        else
            return 0;
    }
    void check(){
        int s=0,k=0;
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(leapyearcheck()==1)
            d[1]=29;
        if(m2>m1) {
            for (int i = m1; i < (m2 - 1); i++) {
                s = s + d[i];
            }
            s = s + d[m1 - 1] - d1;
            s = s + d2;
        }
        else if(m2==m1){
            for(int i=0;i<d2;i++)
                k++;
            s=k;
        }
        System.out.println("Day :"+ s);
    }
    public static void main(String[] args) {
        Birthday_day_no ob=new Birthday_day_no();
        ob.input();
        if(d2<=31&&m2<=12){
            System.out.println("Valid Date");
            ob.check();
        }
        else System.out.println("Invalid date");
    }
}
