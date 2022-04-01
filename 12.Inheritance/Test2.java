class SingleInheritance{
    public void print1(){
        System.out.println("This is the single inheritance in java");
    }
}

class A extends SingleInheritance{
    public void print2(){
        System.out.println("This is the sub class of Single Inheritance");
    }
}

class Test2{
    public static void main(String args[]){
        A obj = new A();
        obj.print1();
        obj.print2();
    }
}