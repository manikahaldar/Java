package maths;

public class Addition{
	int x;
	int y;
	
	public Addition(int a, int b){
		this.x= a;
		this.y= b;
	}
	
	public void add(){
		System.out .println("Addition: "+ (x+y));
	}
}