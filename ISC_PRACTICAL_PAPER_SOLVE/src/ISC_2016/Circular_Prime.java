package ISC_2016;
import java.util.*;
public class Circular_Prime {
    int no;
    static Scanner sc=new Scanner(System.in);
    void input(){
        no=sc.nextInt();
    }
    boolean prime(int n){
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else
            return false;
    }
    void circular_shift(){
        int n1=no;
        int r=0;
    }
}
