//Check the Roll no valid or not

import java.util.*;
class Test7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the roll no :");
		int roll = sc.nextInt();
		
		if(roll<=0){
			System.out.println("Roll no is not valid , Please enter positive no.");
		}
		else{
			System.out.println("Your roll no is: "+roll);
		}
	}
}