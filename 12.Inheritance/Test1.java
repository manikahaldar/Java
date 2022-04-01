import java.util.Scanner;
import java.lang.*;

class circle{
    double radius ;
    Scanner sc = new Scanner(System.in);
    
    
    public double area(){
        System.out.println("Enter the radius of circle is: ");
        radius = sc.nextDouble();
        return Math.PI * radius * radius;
    }

    public double parimeter(){
        return 2 * Math.PI * radius;
    }
}
class Cylinder extends circle{
    double height;

    public double volume(){
        System.out.println("Enter the height of cylinder is: ");
        height = sc.nextDouble();
        return area() * height;
    }
}

class Test1{
    public static void main(String args[]){
        Cylinder c = new Cylinder();

        System.out.println("volume of Cylinder is: "+c.volume());
        System.out.println("Perimeter of circle is: "+c.parimeter());
    } 
}