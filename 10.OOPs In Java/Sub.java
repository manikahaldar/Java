//Inheritance

class Test2{        // --> Test2 is a Base Class(Super Class)
    int a = 500;
    
}
class Sub extends Test2{        //--> Sub is a Derived Class(Sub Class)
    int b = 200;
    public static void main(String args[]){
        Sub obj = new Sub();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}