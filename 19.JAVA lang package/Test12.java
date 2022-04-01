//Constructor in enum with value
enum Dept{
	CSE("Manika","Block A"),ECE("Snita","Block ECE"),IT("Nisha","Block IT"),ME("Prachi","Block ME"),EE("Priti","Block EE");
	
	String student;
	String block;
	 
	//construtor can be private or default
	private Dept(String student,String block){
		this.student=student;
		this.block=block;
	}
	public String getStudentName(){
		return student;
	}
	public String getBlock(){
		return block;
	}
}
class Test12{
	public static void main(String args[]){
		
		Dept obj1 = Dept.CSE;
		
		System.out.println(obj1.getStudentName());
		System.out.println(obj1.getBlock());
	}
}