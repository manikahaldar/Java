//constructor in inheritance
class Parent
{
    Parent()
    {
        System.out.println("Non-Parameter Constructor of parent class");
    }
    Parent(int x)
    {
        System.out.println("Parameter Constructor of parent class "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Parameter Constructor of child class");
    }
    Child(int y)
    {   
        System.out.println("Parameter Constructor of child class "+y);
    }
    Child(int x,int y)
    {
        super(x);  // calling the super class parameterisd constructor using super key word
        System.out.println("2 parameter Constructor of child class "+y);
    }
}

class Test7 {

    public static void main(String[] args) {
        Child c1=new Child();
        Child c2=new Child(15);
        
        // Creating an object of two argument constructor of child class
        Child c3=new Child(10,20);
    }
    
}