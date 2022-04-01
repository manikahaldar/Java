//Local Variable
//Inside the method,constructor or block

class Test2{
    static void m1(){
        int a = 50;              //Local Variable
        int b ;                  //Local Variable
        System.out.println("The value of a is:"+a);     // The value of a is:50
        //System.out.println("The value of b is:"+b);   // Error (b is not initialized)
    }
    static void m2(){
        int d = 20;         //Local Variable
        int e = 10 ;        //Local Variable
        int c = (d+e);
        System.out.println("The value of c is:"+c);       //The value of c is:30
        //System.out.println("The value of a is:"+a);     //Error (a is a local variable od m1)
        m1();               //The value of a is:50
    }

    public static void main(String[] args){
        
        m1();           
        m2();
    }
}