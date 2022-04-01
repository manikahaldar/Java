// Display Geomatric Progression(GP) series

import java.util.Scanner;
class Ex11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting value of series:");
        int Starting = sc.nextInt();
        System.out.println("Enter the ratio value :");
        int ratio = sc.nextInt();
        System.out.println("Enter the nth value of series:");
        int n = sc.nextInt();

        int term = Starting;
        for(int i =0 ; i<n ; i++){
            System.out.print(term +" ");
            term = term * ratio;
        }
    }
}