// Display Fibonacci Series

import java.util.Scanner;
class Ex12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of series:");
        int n = sc.nextInt();

        int n1=0;
        int n2= 1;

        for (int i = 0 ;i<n;i++){
            System.out.print(n1+" ");
            int fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        }
    }
}