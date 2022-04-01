import java.io.*;
class Test1{
    String name;
    int num;

    public Test1(){
        System.out.println("This is the line of consturctor");
    }
    
}

class NoArguments{
    public static void main(String args[]){
        Test1 t = new Test1();
        //System.out.println(t.name);
        System.out.println(t.num);
    }
}