class HierarchialInheritance{
    public void print1(){
        System.out.println("This is the Hierarchial Inheritance");
    }
}

class A extends HierarchialInheritance{
    public void print2(){
        System.out.println("This is the Sub class1 of Hierarchial Inheritance class");
    }
}

class B extends HierarchialInheritance{
    public void print3(){
        System.out.println("This is the Sub class2 of Hierarchial Inheritance class");
    }
}

class C extends HierarchialInheritance{
    public void print4(){
        System.out.println("This is the Sub class3 of Hierarchial Inheritance class");
    }
}


class Test6{
    public static void main(String args[]){
        // Creating an object of Class A Which print class A method and Hierarchial method
        A obj1 = new A();
        obj1.print1();
        obj1.print2();

        // Creating an object of Class B Which print class B method and Hierarchial method
        B obj2 = new B();
        obj2.print1();
        obj2.print3();

        // Creating an object of Class C Which print class C method and Hierarchial method

        C obj3 = new C();
        obj3.print1();
        obj3.print4();
    }
}