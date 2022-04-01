//Method overloading
// Same method name use one or more times i different way

class Test6{
    static int result(int x, int y){
        return (x+y);
    }
    static int result(int a, int b,int c){
        return (a-b-c);
    }
    static float result(float x, float y){
        return (x*y);
    }
    public static void main(String[] args){
        System.out.println("Method1- Sumation of x and y:"+result(30,25));
        System.out.println("Method2- Subtraction of a , b and c:"+result(300,252,10));
        System.out.println("Method3- Multiplication of x and y:"+result(30.56f,25.1f));

    }
}