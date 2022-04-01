//Chech the number is possible to division

import java.util.*;
class Test5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println("Enter a number for divisor:");
		int b = sc.nextInt();
		
		if(b<0){
			System.out.println("Division is not possible because divisor is less than 0");
		}
		else{
			int div = a/b;
			System.out.println("Division :"+div);
		}
	}
}