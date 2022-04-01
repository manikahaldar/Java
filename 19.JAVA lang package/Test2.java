//method override

import java.lang.*;
class MyObject{
	public String toString(){
		return "My Object";
	}
	
	public int hashCode(){
		return 100;
	}
	public boolean equals(Object o){
		return this.hashCode()==o.hashCode();
	}
	//we cannot override the notify method ,wait method or notifyAll method
	//public void notify(){
	
	//}
}

class Test2{
	public static void main(String args[]){
		MyObject obj1 = new MyObject();
		MyObject obj2 = new MyObject();
		
		System.out.println(obj1);
		System.out.println(obj1.equals(obj2));
	}
}