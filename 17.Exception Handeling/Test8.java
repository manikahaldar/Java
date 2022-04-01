//Throws Exception
import java.util.*;
class Test8{
	int method1(int a, int b) throws ArithmeticException
	{
		int div = a/b;
		return div;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Test8 obj = new Test8();
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter secoend number:");
		int b = sc.nextInt();
		try{
		System.out.println("Result:"+obj.method1(a,b));
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
	}
}