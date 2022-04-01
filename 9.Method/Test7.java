//Variable argument

class Test7{
    //static void display(int...a){      //(int...a) the argument will execute operation
        static void display(int[] a);
        for(int x:a){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        //display();   // Return Null
        //display(10,30,40);
        display(new int[]{1,2,3,4,5});      //Anonymus Array
    }
}