abstract class Super{
    public void method1(){
        System.out.println("This is the method1 of Super class");
    }
    abstract public void method2();
}
class Sub extends Super{
    public void method2(){
        System.out.println("This is the method2 of Sub class");
    }
}
class Test3{
    public static void main(String args[]){
        Super obj = new Sub();
        obj.method1();
        obj.method2();
    }
}