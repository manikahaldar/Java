//Nested try-catch block
class Test3{
	public static void main(String args[]){
		try{
			int arr[]={0,5,10,8,4};
			try{
				int r = arr[3]/arr[0];
				System.out.println("Result: "+ r);
			}catch(ArithmeticException e){
				System.out.println("Arithmetic Exception");
				System.out.println(e);
			}
			
			System.out.println("The value of 4th index is: "+arr[4]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception");
		}
	}
}