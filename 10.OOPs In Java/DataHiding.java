// Data hiding
// Find the area and perimeter of rectangle

class Test5{
    private int length;
    private int breadth;

    //return the value of length and breadth of private variable by using get method
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
    //set the value of length and breadth of private variable by using set method
    public void setlenght(int l){
        length = l;
    }
    public void setbreadth(int b){
        breadth = b;
    }
    //retuen the area and perimeter of rectangle
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2*(length + breadth);
    }
}

class DataHiding{
    public static void main(String args[]){
        Test5 obj = new Test5();

        // Return Error because the variable are private.. So using set and get method to access the value 
        // obj.length = 5;
        // obj.breadth = 3;

        // Set the value
        obj.setlenght(5);
        obj.setbreadth(3);

        System.out.println("The area of rectangle: "+obj.area());
        System.out.println("The perimeter of rectangle: "+obj.perimeter());

    }
}