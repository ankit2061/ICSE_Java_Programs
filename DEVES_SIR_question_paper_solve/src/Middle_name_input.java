/*Question:
WAP to input name(name and surname) add the middle name with the input of given name
 */
import java.util.*;
public class Middle_name_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name along with surname excluding your middle name:");
        String name_with_sn=sc.nextLine();
        System.out.println("Enter your middle name:");
        String middle_name=sc.nextLine();
        int l=name_with_sn.length();
        int i=0,l1=0;
        String name="",surname;
        char ch=' ';
        for(i=0;i<l;i++){
            ch=name_with_sn.charAt(i);
            if(ch!=' '){
                name=name+ch;
                continue;
            }
            l1=name.length();
            surname=name_with_sn.substring(l1);
            System.out.println("FULL NAME:  "+name+" "+middle_name+""+surname);
        }

    }
}
