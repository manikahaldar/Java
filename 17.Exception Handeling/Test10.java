//Throws Using Finally
import java.util.*;
class Test10{
	void method1(int a,int b) throws Exception
	{
		try{
			if(a<0 || b<0){
				
				throw new ArithmeticException("Arithmetic Exception");
			}
			else{
				System.out.println("Result:"+ a/b);
			}
		}
		
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	
		finally{
			System.out.println("Finally Message");
		}
	}
	
	public static void main(String args[]) throws Exception{
		Test10 obj = new Test10();
		obj.method1(10,0);
	}
}