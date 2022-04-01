// Check the nuber is prime or not
import java.util.Scanner;
class Example1 {
    boolean isPrime(int n){
        for(int i = 2; i<= n/2 ; i++){
            if(n % i == 0)
                return false;
            
            else
                return true;
            
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the number is prime or not:");
        int num = sc.nextInt();
        Example1 ex = new Example1();
        System.out.println(ex.isPrime(num));
    }
}