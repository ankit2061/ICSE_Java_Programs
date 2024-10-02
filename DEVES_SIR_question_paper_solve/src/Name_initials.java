/*QUESTION:
WAP to input a String(name) and print the following:
Example:
Netaji Subhas Chandra Bose
  I)	BOSE N.S.C
 II)	N.S.C. BOSE
III)	N.S.C.B
 */
import java.util.*;
public class Name_initials {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your full name");
    String full_name=sc.nextLine();
    String surname,s1="";
    char ch;
    full_name=' '+full_name;
    int position=full_name.lastIndexOf(' ');
    surname=full_name.substring(position+1);
    int i=0;
    for(i=0;i<position;i++){  //will extract initials
      ch=full_name.charAt(i);
      if(ch==' ')
        s1=s1+full_name.charAt(i+1)+'.';
    }
    System.out.println("NAME INITIALS:");
    System.out.println(surname+" "+s1);
    System.out.println(s1+" "+surname);
    System.out.println(s1+surname.charAt(0));
  }
}