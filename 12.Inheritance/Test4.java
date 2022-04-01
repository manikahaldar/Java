import java.io.*;

interface A{
    public void print1(){
        System.out.println("This is the multiple Inheritance using Interface A");
    }
}

interface B{
    public void print2(){
        System.out.println("This is the multiple Inheritance using Interface B");
    }
}

interface C extends A,B{
    public void print3(){
        System.out.println("This is the multiple Inheritance using Interface C");
    }
}
class MultipleInheritance implements C{
    public void print4(){
        System.out.println("This is the subclass of Multiple inheritance");
    }
}

class Test4{
    public static void main(String args[]){
        MultipleInheritance obj = new MultipleInheritance();

        obj.print1();
        obj.print2();
        obj.print3();
        obj.print4();
    } 
}