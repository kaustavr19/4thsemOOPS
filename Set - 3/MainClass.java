class ThreeDObject
{
    double wholeSurfaceArea (){
        return 0;
    }
    double volume(){
        return 0;
    }
    double wholeSurfaceArea (int a,int b,int c){
        return 0;
    }
    double volume(int a,int b,int c){
        return 0;
    }
    double wholeSurfaceArea (int a,int b){
        return 0;
    }
    double volume(int a,int b){
        return 0;
    }
    double wholeSurfaceArea (int a){
        return 0;
    }
    double volume(int a){
        return 0;
    }
}
class Box extends ThreeDObject
{
    double wholeSurfaceArea (int l,int b,int h ){
        double sa = 2*(l+b)*h;
        return sa;
    }
    double volume(int l,int b,int h){
        return l*b*h;
    }
}
class Cube extends ThreeDObject
{
    double wholeSurfaceArea (int a){
        double sa = 4*a*a;
        return sa;
    }
    double volume(int a){
        return a*a*a;
    }    
}
class Cylinder extends ThreeDObject
{
    double wholeSurfaceArea (int r,int h ){
        double sa = 2*3.14*r*(r+h);
        return sa;
    }
    double volume(int r,int h){
        return 3.14*r*r*h;
    }
}
class Cone extends ThreeDObject
{
    double wholeSurfaceArea (int r,int h ){
        double sa = 3.14*r*(r+Math.sqrt((r*r)+(h*h)));
        return sa;
    }
    double volume(int r,int h){
        double ar=3.14*r*r*h/3;
        return ar;}}
public class MainClass
{
    public static void main(String args[])
    {
        ThreeDObject box = new Box();
        ThreeDObject cube = new Cube();
        ThreeDObject cylinder = new Cylinder();
        ThreeDObject cone = new Cone();
        System.out.println("The Whole Surface Area of Box is: "+box.wholeSurfaceArea(5,7,3));
        System.out.println("The Whole Surface Area of Cube is: "+cube.wholeSurfaceArea(6));
        System.out.println("The Whole Surface Area of Cone is: "+cone.wholeSurfaceArea(4,2));
        System.out.println("The Whole Surface Area of Cylinder is: "+cylinder.wholeSurfaceArea(4,5));
        System.out.println("The volume of Box is: "+box.volume(6,8,4));
        System.out.println("The volume of Cube is: "+cube.volume(5));
        System.out.println("The volume of Cone is: "+cone.volume(5,8));
        System.out.println("The volume of Cylinder is: "+cylinder.volume(3,8));
    }}