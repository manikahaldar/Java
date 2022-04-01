// Display Arithmatic Prgression(AP) Series

import java.util.Scanner;

class Ex10{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting value of series:");
        int Starting = s.nextInt();
        System.out.println("Enter the step value :");
        int step = s.nextInt();
        System.out.println("Enter the nth value of series:");
        int n = s.nextInt();

        int term = Starting;
        for(int i =0 ; i<n ;i++){
            System.out.print(term + " ");
            term = term + step;
        }
    }
}