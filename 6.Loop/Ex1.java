// Multiplication table 
import java.util.Scanner;

class Ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to dispaly table:");
        int n = sc.nextInt();

        System.out.println("----------Multiplication Table of " + n +"------------");
        for(int i =1; i<=10 ; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}