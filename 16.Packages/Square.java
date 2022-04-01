package area;

public class Square{
	public double length;
	
	
	public Square(double l){
		this.length = l;
		
	}
	
	public void Area(){
		System.out.println("Area of square is:"+ (length*length));
	}
}