/*Question:
Write a program to input names and total marks of N students in two separate arrays

nam[  ] and total[ ] using the bubble sort technique. Print the sorted array of names
along with total marks.
 */
import java.io.*;
public class Student_data {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of Students in your class:");
        int n = Integer.parseInt(br.readLine());
        String nam[] = new String[n];
        int total[] = new int[n];
        int i = 0, j = 0;
        System.out.println("Enter the names and their total marks:");
        for (i = 0; i < n; i++) {
            nam[i] = br.readLine();
            total[i] = Integer.parseInt(br.readLine());
        }
        int temp = 0;
        for (i = 0; i < n-1; i++) {
            for (j = 0; j < (n -1- i); j++) {
                if (total[j + 1] > total[j]) {
                    temp = total[j + 1];
                    total[j + 1] = total[j];
                    total[j] = temp;
                    String s=nam[j+1];
                    nam[j+1]=nam[j];
                    nam[j]=s;
                }
            }
        }
        System.out.println("Names\t\t"+"Total marks");
        for (i = 0; i < n; i++){
            System.out.println(nam[i]+"\t"+total[i]);
        }
    }
}
