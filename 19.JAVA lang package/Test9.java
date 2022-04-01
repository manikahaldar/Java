//Enum

enum Dept{
	CSE,ECE,IT,CIVIL,CS
}
class Test9{
	public static void main(String args[]){
		
		Dept obj1 = Dept.CSE;
		Dept obj2 = Dept.CS;
		Dept obj3 = Dept.ECE;
		
		Dept list[] = Dept.values();
		System.out.println("Department of enum");
		for(Dept x:list)
			System.out.println(x);
		
		//return the index of enum
		System.out.println("Index of obj1: "+obj1.ordinal()); 	//0
		System.out.println("Index of obj2: "+obj2.ordinal());		//4
		System.out.println("Index of obj3: "+obj3.ordinal());		//1
		
		//return the name of enum
		System.out.println("Name of obj1: "+obj1.name());		//CSE
		
		System.out.println(Dept.valueOf("CSE"));
		
		
	}
}