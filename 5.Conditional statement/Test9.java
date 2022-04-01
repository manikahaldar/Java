//Display the grade
import java.util.*;
class Test9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int total = a+b+c;
		int avg = (a+b+c)/3;
		if(avg >= 60)
			System.out.println("Grade A");
		else if(avg>=35 || avg>60)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
	}
}