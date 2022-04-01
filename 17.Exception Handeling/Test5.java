//Using toString & getMessage

import java.util.*;
class Test5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a is: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b is: ");
		int b = sc.nextInt();
		
		try{
			int div= a/b;
			System.out.println("Division:"+div);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
	}
}