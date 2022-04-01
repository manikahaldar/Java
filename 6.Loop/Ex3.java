// factorial of a number

import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial of a number:");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i  = 1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is: " + factorial);
    }
}