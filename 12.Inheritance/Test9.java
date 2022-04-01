class A{
    public void method1(){
        System.out.println("This is the method1 of super class");
    }
    public void method2(){
        System.out.println("This is the method2 of super class");
    }
}

class B extends A{
    public void method2(){      //Overriding method of super class
        System.out.println("This is the method2 of sub class");
    }
    public void method3(){
        System.out.println("This is the method3 of sub class");
    }
}

class Test9{
    public static void main(String args[]){
        A obj = new B();
        obj.method1();
        obj.method2();
        // obj.method3();
    }
}