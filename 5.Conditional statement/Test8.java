//Check the current hour is working hour or leisure hour
import java.util.*;

class Test8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current hour in (0 to 23) :");
		int hour = sc.nextInt();
		
		if(hour>9 || hour>18){
			System.out.println("This is working time"); 
		}
		else{
			System.out.println("This is leisure hour");
		}
	}
}