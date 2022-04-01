//Find the Maximum Of Three number

import java.util.*;
class Test3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c){
			System.out.println(a + " is the maximum number");
		}
		else if(b>a && b>c){
			System.out.println(b + " is the maximum number");
		}
		else{
			System.out.println(c + " is the maximum number");
		}
		
	}
}