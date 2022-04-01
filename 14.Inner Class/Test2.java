//Local Inner class

class Outer{
    int a = 10;
    //Creating an method to create a inner class
    public void outerMethod1(){
        class Inner{
            final int b = 20;
            public void innerMethod2(){
                System.out.println("This is the under Inner class");
                System.out.println("Value of a is: "+a);
                System.out.println("Value of b is: "+b);
            }
        }
        //Creating an object of inner class
        Inner obj1 = new Inner();
        obj1.innerMethod2();

        
    }
    //Creating an object of inner class
    //Showing an error ,because it is not possible to access the local inner class with out any method block
    //Inner obj1 = new Inner();
    //obj1.innerMethod2();
}

class Test2{
    public static void main(String args[]){
        //Creating an object of Outer classs
        Outer obj2 = new Outer();
        obj2.outerMethod1();

        // Local inner class is not access directly
        // Outer.Inner obj3 = new Outer().Inner();
        // obj3.outerMethod1();
    }
}