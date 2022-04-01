//Reverse Number

import java.util.Scanner;

class Ex7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert reverse digits:");
        int num = sc.nextInt();

        int rev=0;
        while(num!=0){
            int m = num%10;
            rev = rev * 10 + m;
            num /= 10;
        }
        System.out.println("Rverse digit is: "+ rev);
        
    }
}