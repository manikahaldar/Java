//Didplay the day name of week 

import java.util.*;
class Test10{
	public static void main(String arg[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the day no :");
		int day = sc.nextInt();
		
		if(day>7){
			System.out.println("Day is invalid");
		}
		else if(day == 1){
			System.out.println("The day is Sunday");
		}
		else if(day == 2){
			System.out.println("The day is Monday");
		}
		else if(day == 3){
			System.out.println("The day is Tusday");
		}
		else if(day == 4){
			System.out.println("The day is Wednesday");
		}
		else if(day == 5){
			System.out.println("The day is Thursday");
		}
		else if(day == 6){
			System.out.println("The day is Friday");
		}
		else{
			System.out.println("The day is Saturday");
		}
	}
}