//Passing object to a mrthod

class Test4{
    int i;
    int j;

    void add(int x,int y){
        i = x;
        j = y;
    }
    
    //
    void display(){
        System.out.println(i);
        System.out.println(j);
    }
}
class PassingObject{

    //To Passing the new value of add method form another new static method
    static void method(Test4 p){
        p.add(6,8);
    }
    public static void main(String args[]){
        Test4 t = new Test4();
        t.add(5,3);         // calling the orijinal value of add method
        //t.display();
        method(t);          // calling the modified value of static method
        t.display();        // printing the modified value 
    }
}