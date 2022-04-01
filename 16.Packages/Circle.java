package area;

public class Circle{
	public double radius;
	
	public Circle(double r){
		this.radius = r;
	}
	
	public void Area(){
		System.out.println("Area of Circle is:"+ (3.14*radius*radius));
	}
}