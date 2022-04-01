//Throw exception
class Test7{

	void method1(int a,int b){
		if(a<=0 || b<= 0){
			throw new ArithmeticException("This is under Arithmetic Exception");
		}
		else{
			System.out.println("Reasult:"+ a/b);
		}	
	}
	
	public static void main(String args[]){
		Test7 obj = new Test7();
		obj.method1(10,2);
	}
}