//Static Variable
//with Static keyword inside the class but outside the method, constructor or block

class Test4{
    static int a = 30;      //Initialized Static Variable
    static int b;           //Uninitialized Static Variable

    static void m1(){
        System.out.println("The value of a is:"+a);         //The value of a is:30
        System.out.println("The value of b is:"+b);         //The value of b is:0(default value)
    }
    void m2(){              // Static method calling in non-static method
        m1();
    }
    public static void main(String[] args){
        //we cane access static variable by creating object of the class name
        Test4 method = new Test4();
        m1();
        method.m2();
        method.a = 50;
        System.out.println(method.a);       //50
        //We can access static variable with calss name
        System.out.println(Test4.a);        //50
    }
}