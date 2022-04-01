import java.util.Scanner;
class UnBoxing{
    public static void main(String args[]){
        // Integer a = 83;
        // int a1 = a;

        // Character c = 'M';
        // char c1 = c ;
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        int a1 = a;

        System.out.println("The value of a is: "+ a);
        System.out.println("The unboxing of a is: "+a1);
        // System.out.println("The value of c is: "+c);
        // System.out.println("The unboxing of c is: "+c1);
    }
}