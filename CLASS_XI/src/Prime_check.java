import java.util.*;
public class Prime_check
{
     int num;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is  prime:");
        num=sc.nextInt();
    }
    int prime(){
        int c=0,f=0;
        int n=num;
        for(int i=1;i<n;i++){
            if(n%i==0) {
                c++;
                //System.out.println(c);
            }
        }
        if(c==2)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Prime_check ob=new Prime_check();
        ob.input();
        int check=ob.prime();
        if(check==1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
