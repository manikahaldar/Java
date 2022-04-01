//try-catch-finally
import java.util.*;
class Test4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		try{
			int div = a/b;
			
			System.out.println("Division: "+div);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}
		finally{
			int mul = a*b;
			System.out.println("Multiplication:"+mul);
			
			System.out.println("Thank u");
		}
	}
}