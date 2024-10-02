import java.util.*;
public class Circular_prime_my_process
{
    int prime_check(int n){
        int i=0,c=0,f=0;
        for (i=2; i<n/2; i++)
        {
            if (n%i == 0)
                c++;
        }
        if(c==0)
            f=1;
        else
            f=0;
        return f;
    }
}
