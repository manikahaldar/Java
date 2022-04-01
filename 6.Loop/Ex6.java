// Chech the number is Armstrong or not

import java.util.Scanner;
class Ex6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m=n;
        int r;
        int a = 0;
        while(n>0){
            r = n % 10;
            n = n / 10;

            a = a+r*r*r; 
        }
        if(a==m){
            System.out.println("The number is a Armstron Number");
        }
        else{
            System.out.println("The number is not a Armstron Number");
        }
    }
}