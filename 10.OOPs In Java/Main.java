//Method Overriding

class Test1{
    void show(){
        System.out.println("This is under parent Class");
    }

    // public static void main(String[] args){
    //     Test1 obj1 = new Test1();
    //     obj1.show();

    //     Test1 obj2 = new subTest1();
    //     obj2.show();
    // }
}

class subTest1 extends Test1{
    void show(){
        System.out.println("This is under the sub-class");
    }
}
class Main{
    public static void main(String[] args){
        Test1 obj1 = new Test1();
        obj1.show();

        Test1 obj2 = new subTest1();
        obj2.show();
    }
}

  
