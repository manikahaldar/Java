//Creating a abstract class
abstract class Super{
    public void method1(){
        System.out.println("This is the method1 of super class");
    }
    public void method2(){
        System.out.println("This is the method2 of super class");
    }
    
}
//Creating a Sub class(Using Inheritance)
class Sub extends Super{
    public void method3(){
        System.out.println("This is the method3 of Sub class");
    }
}
//Main class
class Test2{
    public static void main(String args[]){
        //Creating an obj of sub class
        Sub obj = new Sub();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}