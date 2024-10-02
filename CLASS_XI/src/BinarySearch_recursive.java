public class BinarySearch_recursive {
    String binSearch(int a[],int l,int h,int ele){
        if(l<h)
            return ("Element not found");
        else if (ele==a[(l+h)/2]) {
            return ("Element found");
        }
        else if(ele<a[(l+h)/2])
            return binSearch(a,l,(l+h)/2-1,ele);
        else if(ele>a[(l+h)/2])
            return binSearch(a,(l+h)/2+1,h,ele);
        else return ("");
    }
}
