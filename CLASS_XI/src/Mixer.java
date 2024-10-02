/*
A class Mixer has been defined to merge two sorted integer arrays in ascending order.
Some of the members of the class are given below:

[10]

Class name : Mixer
Data members/instance variables:
int arr[ ] : to store the elements of an array
int n : to store the size of the array
Member functions:
Mixer(int nn) : constructor to assign n=nn
void accept( ) : to accept the elements of the array in ascending

order without any duplicates

Mixer mix(Mixer A) : to merge the current object array elements with
the parameterized array elements and return the
resultant object

void display( ) : to display the elements of the array
Specify the class Mixer, giving details of the constructor(int), void accept( ), Mixer mix(Mixer) and void display( ) . Define the main( ) function to create an object
and call the function accordingly to enable the task.
 */
import java.util.*;
public class Mixer
{
    int arr[];
    int n;
    Mixer(int nn){
        n=nn;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array in ascending" +"order without any duplicates ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix(Mixer A){
        Mixer B=new Mixer(n+A.n);
        int x=0;
        for(int i=0;i<n;i++) {
            B.arr[x++] = arr[i];
            for(int j=0;j<A.n;j++){
            }
        }
        return B;
    }
}
