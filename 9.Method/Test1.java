class Test1{
    // Empty Patameter List

    int max()
    {
        int x = 10, y = 20;
        if(x>y)
            return x;
        else
            return y;
    }

    //Non empty parameter List

    // int max(int x,int y){
    //     if(x>y)
    //         return x;
    //     else
    //         return y;

    // }

    public static void main(String args[]){
        // int x = 10;
        // int y = 20;
        Test1 ts = new Test1();
        // System.out.println(ex.max(x,y));
        System.out.println(ts.max());
    }
}