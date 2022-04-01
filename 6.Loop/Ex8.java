// Palindrome Number

import java.util.Scanner;
class Ex8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to chech the number is palindrome is not:");
        int num = sc.nextInt();

        int rev = 0;
        int m = num;

        while (num!=0){
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        if(rev == m){
            System.out.println("The number is Palindrome number");
        }
        else{
            System.out.println("The number is not a Palindrome number");
        }
    }
}