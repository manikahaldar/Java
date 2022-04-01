

import java.util.*;
class Test4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice you want to perform");
		System.out.println("1. ADD\n2. SUBTRACTION\n3. MULTIPLICATION\n4. DIVISION ");
		
		int operation = sc.nextInt();
		int result = 0,num1,num2;
		
		switch(operation){
			case 1: 
				System.out.println("Enter the first number:");
				num1 = sc.nextInt();
				System.out.println("Enter the second numbre:");
				num2 = sc.nextInt();
				result= num1+num2;
				System.out.println("ADD = "+result);
				break;
			case 2: 
				System.out.println("Enter the first number:");
				num1 = sc.nextInt();
				System.out.println("Enter the second numbre:");
				num2 = sc.nextInt();
				result= num1-num2;
				System.out.println("SUBTRACTION = "+result);
				break;
			case 3: 
				System.out.println("Enter the first number:");
				num1 = sc.nextInt();
				System.out.println("Enter the second numbre:");
				num2 = sc.nextInt();
				result= num1*num2;
				System.out.println("MULTIPLICATION = "+result);
				break;
			case 4: 
				System.out.println("Enter the first number:");
				num1 = sc.nextInt();
				System.out.println("Enter the second numbre:");
				num2 = sc.nextInt();
				result= num1/num2;
				System.out.println("DIVISION = "+result);
				break;
				
			default:
				System.out.println("Invalid");
				
		}
	}
}