import java.util.*;
public class String_loader {
    void stringload (String s, char ch1, char ch2){
        s=s.replace(ch1,ch2);
        System.out.println("New String: "+s);
    }
    void stringload(String s){
        int f_space=s.indexOf(' ');
        int l_space=s.lastIndexOf(' ');
        System.out.println("First Index: "+f_space);
        System.out.println("Last Index: "+l_space);
    }
    void stringload ( String s1, String s2 ){
        String s=s1+" "+s2;
        System.out.println("New String: "+s);
    }

    void main(String[] args) {

    }
}
