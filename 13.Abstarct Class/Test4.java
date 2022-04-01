abstract class Super{
    public Super(){
        System.out.println("This is the constructor super abstract class");
    }

    public void method1(){
        System.out.println("The is tha method1 of super abstract class");
    }
    abstract public void method2();
    
}

class Sub extends Super{
    public void method2(){
        System.out.println("This is the method2 of sub class which is overriden of abstract method");
    }
}

class Test4{
    public static void main(String args[]){
        Sub obj = new Sub();

        obj.method1();
        obj.method2();
    }
}