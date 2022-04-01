class A{
    final void fun(){
        System.out.println("This is the final calss");
    }
}
class B extends A{
    public void fun1(){
        System.out.println("This the sub class of final class");
    }
}

class Test8{
    public static void main(String args[]){
        B obj = new B();
        obj.fun();
     
        obj.fun10();   
    }
}