//Nested Inner class

class Outer{
    int a = 10;
    
    // Inner obj1 = new Inner();
    class Inner{
        int b = 20;
        
        //inner class method its only return the inner function and also outer fu
        public void Innermethod1(){
            System.out.println("This is under inner class");
            System.out.println("Value of a is: "+a);
            System.out.println("Value of b is: "+b);
            Outermethod2();
        }
        // Outermethod2();
    }

    //outer class method its only return the outer function
    public void Outermethod2(){
        System.out.println("This is under outer class");
        System.out.println("Value of a is: "+a);
        
        //Showing an error because b was initialize under inner class
        //System.out.println("Value of b is: "+b);
    }
    // Showing an error , because without any method inner class is not access
    // Inner obj1 = new Inner();
    // obj1.Innermethod1();

    public void Outermethod3(){
        //Creating an object of inner class
        Inner obj1 = new Inner();
        obj1.Innermethod1();

    }
}

class Test1{
    public static void main(String args[]){
        Outer obj2 = new Outer();
        //print the inner method
        obj2.Outermethod3();
        //print the outer method
        obj2.Outermethod2();

        //direct acces the inner class
        Outer.Inner obj3 = new Outer().new Inner();
        obj3.Innermethod1();
    }
}