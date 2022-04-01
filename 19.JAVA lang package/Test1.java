//methods of object class

import java.lang.*;
class MyObject{
	
}
//Inherit the MyObject class
class MyObject2 extends MyObject{
	
}
class Test1{
	public static void main(String args[]){
		Object obj1 = new Object();
		//Object o2 = o1;    --> return true for equals method
		Object obj2 = new Object();
		//Override the MyObject class
		MyObject obj3 = new MyObject();
		
		//object for inherited class
		MyObject2 obj4 = new MyObject2();
		
		System.out.println("TOSTRING: "+obj1.toString());
		System.out.println("obj1 EQUALS obj1: "+obj1.equals(obj1));
		System.out.println("obj1 EQUALS obj2: "+obj1.equals(obj2));
		
		System.out.println("HASHCODE of obj1: "+ obj1.hashCode());
		
		System.out.println("HASHCODE of obj3: "+ obj3.hashCode());
		System.out.println("HASHCODE of obj4: "+ obj4.hashCode());

	}
}