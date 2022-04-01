//Instance And Static Variable

class Test5{
    static int a = 10;      //Initialized Static variable
    static int b ;          //Uninitialized Static variable

    int c = 20;             //Initialized Static variable
    int d ;             //Uninitialized Static variable

    static void m1(){
        System.out.println("The value of a is:"+a);     // The value of a is:10
        System.out.println("The value of b is:"+b);     // the value of b is:0 (default value is 0)

        //System.out.println("The value of c is:"+c);     //Error(c is the non-static variable)
        //System.out.println("The value of d is:"+d);     //Error(d is the non static variable)

    }
    void m2(){
        System.out.println("The value of a is:"+a);     // The value of a is:10
        System.out.println("The value of b is:"+b);     // the value of b is:0 (default value is 0)

        System.out.println("The value of c is:"+c);     // The value of c is:20
        System.out.println("The value of d is:"+d);     // The value of d is:0 (default value is 0)

    }
    public static void main(String[] args){
        m1();
        //m2();   // Error(m2 is a non-static method, so first creat an object the it will execute)
        Test5 method = new Test5();
        method.m2();
        method.a = 80;
        method.b = 70;
        
        Test5 method1 = new Test5();
        method1.a= 40;
        method1.c= 60;
        System.out.println(method1.a);      //modify Static variable
        System.out.println(method1.c);      //modify non-static variable

    }
}