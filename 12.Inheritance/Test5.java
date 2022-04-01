class MultiLevelInheritance{
    public void print1(){
        System.out.println("This is the Milti-Level Inheritance in java");
    }
}

class A extends MultiLevelInheritance{
    public void print2(){
        System.out.println("This is the sub class of MultiLevel Inheritance");
    }
}

class B extends A{
    public void print3(){
        System.out.println("This is the another sub class of A class");
    }
}

class Test5{
    public static void main(String args[]){
        B obj = new B();
        obj.print1();
        obj.print2();
        obj.print3();
    }
}