//Poduct of an array 
import java.util.*;
class Test4{
	int productArray(int arr[],int n){
		
		if(n<=0){
			return 1;
		}
		else{
			return (productArray(arr,n-1)*a[n-1]);
		}
	}
	public static void main(String args[]){
		
		
		Test4 obj= new Test4();
		System.out.println("Product of an array is: "+obj.productArray({2,5,3,6},2);
	}

}