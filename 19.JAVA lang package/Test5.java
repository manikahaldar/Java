//methods of float class

import java.lang.*;
class Test5{
	public static void main(String args[]){
		float f = 12.5f;
		Float obj = 12.5f/0;
		Float obj2 = (float)Math.sqrt(-1);
		Float obj3 = (float)Math.sqrt(9);
		
		//Check infinity or not
		System.out.println(obj.isInfinite());			//true
		System.out.println(obj==Float.POSITIVE_INFINITY);	//true
		System.out.println(obj==Float.NEGATIVE_INFINITY);	//flase
	
		//NaN->Not a number
		System.out.println(obj2.isNaN());     //true
		System.out.println(obj3.isNaN());		//false
		System.out.println(obj2!=Float.NaN);	//true
	
	}
}