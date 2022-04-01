//Using inheritance
import java.util.*;
class A{
	double a;
	double b;
}
class B extends A{
	
	void division(int x, int y){
		try{
			this.a=x;
			this.b=y;
			
			System.out.println("Division:"+ x/y);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}

}
class Test6{
	public static void main(String args[]){
		B obj = new B();
		obj.division(10,0);
	}
}