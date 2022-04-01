class Test3{
    String name;
    int num;

    // Creating a without argumnet constructor
    Test3(){
        System.out.println("This is the line of no arguments construtor");
    }

    // Creating a with argumnet constructor
    Test3(int x ,String N){
        System.out.println("This is the line of with arguments construtor");
        num = x;
        name = N;
    }
}
class Constructor{
    public static void main(String args[]){
        //Creating an object for without argument constructor
        Test3 t1 = new Test3();
        System.out.println("Without Arguments Constructor - Value of num :"+t1.num);
        System.out.println("Without Arguments Constructor - "+t1.name);

        //Creating an object for with argument constructor
        Test3 t2 = new Test3(83,"HelloWorld");      //Initialization
        System.out.println("With Arguments Constructor - Value of num : "+t2.num);
        System.out.println("With Arguments Constructor - "+t2.name);
    }
}