public class Sum_of_digits_recursive {
    int s=0;
    int sumOfdidgits(int n){
        if(n==0)
            return s;
        else{
            s=s+n%10;
            return sumOfdidgits(n/10);
        }
    }
}
