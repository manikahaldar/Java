//Creating Abstract class
abstract class Super{
    public void method1(){
        System.out.println("This is the method1 of super class");
    }
    public void method2(){
        System.out.println("This is the method2 of super class");
    }
    
}
//Main class
class Test1{
    public static void main(String args[]){
        //Creating as object of super class
        //Showing an error , because here super is the abstract class ,so in this code Super class cannot be Instantiated,Abstarct class cannot create an object
        Super obj = new Super();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}