//Instance Variable
//Inside class but Outside the method,constructor or block
//First it create an object then it will execute
//In Instance Variable if we create many method and we modify the value so the it will return the upadting value
 


class Test3{
    int a = 60;     //Instance Variable
    int b;          //Uninitialized Instance Variable
    void m1(){
        System.out.println("The value of a is:"+a);     //The value of a is:60
        System.out.println("The value of b is:"+b);     //The value of b is:0 (Default value)
    }
    public static void main(String[] args){
        // Creating an object to acces the instance variable
        Test3 method = new Test3();     
        method.m1();
        method.a = 30;
        System.out.println(method.a);    // Udpadting the value of a(30)
        Test3 method1 = new Test3();
        method1.a = 40;
        System.out.println(method1.a);   // Upadting the value of a(40)
    }
}