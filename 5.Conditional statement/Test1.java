// Find a number is odd or even

import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check th number is odd or even:");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}