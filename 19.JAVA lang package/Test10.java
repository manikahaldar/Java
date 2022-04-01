//Switch case in enum
enum Dept{
	CSE,ECE,IT,ME,EE
	
	
}
class Test10{
	public static void main(String args[]){
		
		Dept obj1 = Dept.CSE;
		
		switch(obj1){
			case CSE:
				System.out.println("Manika \nBlock: CSE");
				break;
			case ECE:
				System.out.println("Snita \nBlock: ECE");
				break;
			case IT:
				System.out.println("Nisha \nBlock: IT");
				break;
			case ME:
				System.out.println("Prachi \nBlock: ME");
				break;
			case EE:
				System.out.println("Priti \nBlock: EE");
				break;
		}
	}
}