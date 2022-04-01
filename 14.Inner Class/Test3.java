abstract class Anonymous{
    abstract public void method1();
}

class Outer{
    public void outerMethod2(){
        // Anonymous obj = new Anonymous(){
        //     public void method1(){
        //         System.out.println("This is the anonymous inner class");
        //     }
        // };
        // obj.method1();

        new Anonymous(){
            public void method1(){
                System.out.println("This is the anonymous inner class");
            }
        }.method1();


    }
}

class Test3{
    public static void main(String args[]){
        Outer obj1 = new Outer();
        obj1.outerMethod2();
    }
}