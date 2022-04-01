//Constructor in enum
enum Dept{
	CSE,ECE,IT,ME,EE;
	
	//construtor can be private or default
	private Dept(){
		System.out.print("Name of the department :");
		System.out.println(this.name());
	}
	public void display(){
		
		System.out.println("Name with indec: "+this.name()+" "+this.ordinal());
	}
}
class Test11{
	public static void main(String args[]){
		
		Dept obj1 = Dept.CSE;
		//display the method
		obj1.display();
	}
}