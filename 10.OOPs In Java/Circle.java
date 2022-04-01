//Example of class
//Find the area, perimeter of circle

import java.lang.*;

class Test3{
    double radius = 3.5;

    double area(){
        return Math.PI*radius*radius;
    }

    double perimeter(){
        return 2*Math.PI*radius;
    }

}

class Circle{
    public static void main(String args[]){
        Test3 t = new Test3();
        System.out.println("Area of Circle:"+t.area());
        System.out.println("Perimeter of Circle:"+t.perimeter());

    }
}