class Test2{
    int num1;
    int num2;
    int num3;

    Test2(int a, int b){
        // num1 = a;
        // num2 = b;
        // num3 = num1 + num2;

        this.num1 = a;
        this.num2 = b;
        this.num3 = this.num1 + this.num2;
        System.out.println("Value of num1 and num2 of constructor:"+this.num3);
    }
    
}

class WithArguments{
    public static void main(String args[]){
        Test2 t = new Test2(10,5);
        // System.out.println("Value of num1 and num2 of constructor:"+t.num3);
        System.out.println(t.num3);     // Not showing an error because we initialize the value
    }
}