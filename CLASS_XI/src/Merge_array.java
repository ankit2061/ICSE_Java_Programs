import java.sql.SQLOutput;
import java.util.*;
public class Merge_array
{
    int a[],m,n,at[];
    Merge_array(int mm){
        m=mm;
    }
    void readarray(){
        Scanner sc=new Scanner(System.in);
        a=new int[m];
        for(int i=0;i<m;i++){
                a[i]=sc.nextInt();
        }
    }
    void print(){
        for(int i=0;i<m;i++){
            System.out.println(a[i]+"\t");
        }
    }
    void merge(Merge_array A,Merge_array B){
        int mt=A.m+B.m;
        at=new int[mt];
        for(int i=0;i<A.m;i++){
            at[i]=A.a[i];
        }
        for(int i=A.m;i<mt;i++){
            at[i]=B.a[i];
        }
    }
    void sort(){
        for (int i = 0; i < at.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++){
                if (at[j] < at[index]){
                    index = j;//searching for lowest index
                }
            }
            int temp= at[index];
            at[index] = at[i];
            at[i] = temp;
        }
    }
    void print_merge(){
        for(int i=0;i<at.length;i++){
            System.out.println(at[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the first array:");
        int m1=sc.nextInt();
        System.out.println("Enter the elements of the first array:");
        int m2=sc.nextInt();
        Merge_array ob1=new Merge_array(m1);
        Merge_array ob2=new Merge_array(m2);
        ob1.readarray();
        ob1.print();
        ob2.readarray();
        ob2.print();
        ob1.merge(ob1,ob2);
        ob1.print_merge();
    }
}
