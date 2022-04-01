//Static inner class

class Outer{
    int a = 10;
    static int b = 20;

    static class Inner{
        public void Innermethod1(){
            System.out.println("This is under Inner class");
            //showing an error because a is non static
            //System.out.println("Value of a is:"+a);
            System.out.println("Value of b is:"+b);

        }
    }
}

class Test4{
    public static void main(String args[]){
        Outer.Inner obj = new Outer.Inner();
        obj.Innermethod1();
    }
}