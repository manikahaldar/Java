//Check a number is negetive or not

import java.util.*;
class Test6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check positive or negetive");
		int num = sc.nextInt();
		
		if(num<0){
			System.out.println(num + " is negetive number");
		}
		else{
			System.out.println(num + " is positive number");
		}
	}
}