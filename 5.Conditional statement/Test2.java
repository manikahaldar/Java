// find the is young or not

import java.util.Scanner;
class Test2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();

        if(age>=18 && age<= 24){
            System.out.println("She is now Adult stage");
        }
        else if(age>=25 && age<=40){
            System.out.println("She is now Young stage");
        }
        else{
            System.out.println("She is now old stage");

        }
    }
}
