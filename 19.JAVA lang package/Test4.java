//methods of Integer class
import java.lang.*;
class Test4{
	public static void main(String args[]){
		int num1 = 15;
		//num2 is wrraped the value of num1
		Integer num2 = num1;
		Integer num3 = 15;
		
		Integer num4 = Integer.valueOf("123");
		Integer num5 = Integer.valueOf("1010",2);		//return Integer number of 1010 binar number
		Integer num6 = Integer.valueOf("11111111",2);	//return Integer number of 11111111 binary number
		Integer num7 = Integer.valueOf("A7",16);		//return Integer number of A7 hexa-decimal number
		
		System.out.println(num2.equals(num1));		//true
		System.out.println(num2.equals(num3));		//true
		System.out.println(num5);					//10
		System.out.println(num6);					//225
		System.out.println(num7);					//167
		
		//String covert to Integer
		System.out.println(Integer.parseInt("123")); //123
		//System.out.println(Integer.parseInt("123a"));	//number format exception only number is allowed
		
		//reverse a Byte
		System.out.println(Integer.reverseBytes(123));							//2063597568
		System.out.println(Integer.reverseBytes(123)==Integer.MIN_VALUE);		//false
		
		//Convert to Binary
		System.out.println(Integer.toBinaryString(40));			//101000
	
	}
}