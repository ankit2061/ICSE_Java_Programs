public class Dec_toOct {
    int dec_to_oct(int n){
        if(n==0)
            return 1;
        else return (n%8*10+dec_to_oct(n/8));
    }
}
