class A{
    public void print1(){
        System.out.println("This is the multiple Inheritance (class1) in java");
    }
}

class B{
    public void print2(){
        System.out.println("This is the multiple Inheritance (Class2) in java");
    }
}

class MultipleInheritance extends A, B{
    public void print3(){
        System.out.println("This is the subclass of Multiple inheritance");
    }
}

class Test3{
    public static void main(String args[]){
        MultipleInheritance obj = new MultipleInheritance();

        obj.print1();
        obj.print2();
        obj.print3();
    } 
}