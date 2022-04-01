interface Super{
    public void method1();
    public void method2();
}

// class sub extends Super          --> Showing an error
class sub implements Super{
    //override the method1
    public void method1(){
        System.out.println("This is the method1 of sub class which is overriden of implements by super interface");
    }
    //override the method2
    public void method2(){
        System.out.println("This is the method2 of sub class which is overriden of implements by super interface");
    }
    public void method3(){
        System.out.println("This is the method3 of sub class");
    }
}

class Test1{
    public static void main(String args[]){
        Super obj = new sub();
        obj.method1();
        obj.method2();
        // obj.method3();   //Showinh an error

        sub obj1 = new sub();
        obj1.method3();

        //Showinh an error
        // sub obj2 = new super();
        // obj2.method1();
    }
}