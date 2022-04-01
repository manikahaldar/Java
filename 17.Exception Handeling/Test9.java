//Throws Exception usnig throw
import java.util.*;
class Test9{
	int area(int l,int b) throws Exception
	{
		if(l<=0 || b<=0){
			throw new ArithmeticException("This is an Arithmetic Exception");
		}else{
			return l*b;
		}
	}
	void method1() throws Exception
	{
		System.out.println("Area is: "+area(5,0));
	}
	void method2() throws Exception
	{
		method1();
	}
	
	public static void main(String args[]) throws Exception{
		Test9 obj = new Test9();
		obj.method2();
	}
}