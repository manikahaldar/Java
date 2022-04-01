// Sum of n natural number

import java.util.Scanner;

class Ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of natural number");
        int n = sc.nextInt();
        int sum =0;

        for(int i =0; i<=n ;i++){
            sum = sum+ i;
        }
        System.out.println("Sumation of n natural number is: "+sum);

    }
}