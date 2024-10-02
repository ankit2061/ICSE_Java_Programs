package St_Xavier_papersolve;
public class Volume {
    double vol=0;
    void volume(int s){
        vol=s*s*s;
        System.out.println("Volume of the cube:\t"+vol);
    }
    void volume(int l,int b,int h){
        vol=l*b*h;
        System.out.println("Volume of the cuboid:\t"+vol);
    }
    void volume(double r){
        vol=(4/3)*3.14*(Math.pow(r,3));
        System.out.println("Volume of the Sphere:\t"+vol);
    }
}
