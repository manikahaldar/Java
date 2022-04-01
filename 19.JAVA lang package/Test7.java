//String vs String Buffer vs Sting Builder

import java.lang.*;
class Test7{
	public static void main(String args[]){
		String obj1 = new String("Hello");
		
		StringBuffer obj2 = new StringBuffer("Hello");
		
		StringBuilder obj3 = new StringBuilder("Hello");
		
		obj1.concat(" World1");
		obj2.append(" World2");
		obj3.append(" World3");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
