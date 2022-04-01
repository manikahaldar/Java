// Count a digit of a number

import java.util.Scanner;
class Ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Total digit of a number:" +count);                                             
    }
}