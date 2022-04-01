//Multiple catch block

class Test2{
	public static void main(String args[]){
		try{
			int arr[]={1,2,3,4,5,0};
			int r = arr[0]/arr[5];
		
			System.out.println("Result:"+r);
			System.out.println("The value of 7th index of array:"+arr[5]);
		}catch(ArithmeticException e){
			System.out.println("Anything divided by zero, shows ERROR");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("This value out of index");
		}
		
	}
}