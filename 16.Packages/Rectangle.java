package area;

public class Rectangle{
	public double length;
	public double breadth;
	
	public Square(double l,double b){
		this.length = l;
		this.breadth = b;
	}
	
	public void Area(){
		System.out.println("Area of Rectange is:"+ (length*breadth));
	}
}