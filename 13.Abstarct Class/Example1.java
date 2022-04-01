import java.lang.*;
import java.util.*;

abstract class shape{
    abstract double parimeter();
    abstract double area();
}

//subclass of shape class
class circle extends shape{
    double radius;
    Scanner sc = new Scanner(System.in);
   
   //override the abstract method perimeter
    double parimeter(){
        System.out.println("Enter the radius of circle is: ");
        radius = sc.nextDouble();
        return 2*Math.PI*radius;   
    }
    ////override the abstract method area
    double area(){
        return Math.PI*radius*radius;
    }
}
//another subclass of shape class
class rectangle extends shape{
    double length;
    double breadth;
    Scanner sc = new Scanner(System.in);

    //override the abstract method perimeter
    double parimeter(){
        System.out.println("Enter the length of rectangle is: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle is: ");
        breadth = sc.nextDouble();

        return 2*(length+breadth);   
    }
    //override the abstract method area
    double area(){
        return length*breadth;
    }
}

//Main class
class Example1{
    public static void main(String args[]){
        //creating an object of circle sub class
        circle obj1 = new circle();
        System.out.println("Perimeter of circle is: "+obj1.parimeter());
        System.out.println("Area of circle is: "+obj1.area());

        //creating an object of rectangle sub class
        rectangle obj2 = new rectangle();
        System.out.println("Perimeter of rectangle is: "+obj2.parimeter());
        System.out.println("Area of rectangle is: "+obj2.area());
    }
}