/*
Write a menu driven java program to find the sum of the series given below.
S=1+(x+2)/2! + (2x+3)/3! + (3x+4)/4! +………. n terms
S=x2/1! + x4/3! + x6/5! +………….xn/(n-1)!
 */
import java.util.*;
public class Series
{
    double s;
    //int n,x;
    int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++)
            f=f*i;
        return f;
    }
    double seriesOne(int x,int n){
        for(int i=2;i<=n;i++)
            s=((i-1)*x+2)/fact(2);
        s=s+1.0;
        return s;

    }
}
