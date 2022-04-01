//class Test1{
//	public static void main(String args[]){
//		int a,b,c;
//		a=5;
//		b=0;
//		c=a/b;
//		System.out.println(c);
//		System.out.println("End");
//	}
//}

//handeling the exception error
class Test1{
	public static void main(String args[]){
		int a,b,c;
		try{
			a=5;
			b=0;
			c=a/b;
			System.out.println(c);
			System.out.println("End");
		}catch(ArithmeticException e){
			System.out.println("Anythinf divided by zero shows ERROR");
			
		}
	}
}