//Wrapper class

class Test3{
	public static void main(String args[]){
		
		//Creating a object of Integer
		Integer i = new Integer(10);
		Integer obj = Integer.valueOf(10);
		Integer obj2 = 10;
		
		//Creating a object of Byte
		Byte obj3 = 15;
		Byte obj4 = Byte.valueOf("15");
		//Byte obj5 =Byte.valueOf(15);  ->Showing an error , we assign the byte type of value
		byte b = 15;
		Byte obj5 = Byte.valueOf(b);	//->b is a byte type of variable
		
		//Creating a object of Short
		Short obj6 = Short.valueOf("123");
		
		//Creating a object of Float
		Float f = 123f;
		Float obj7 =Float.valueOf("123.5");
		
		//Creating a object of Double
		Double obj8 = Double.valueOf(123.456);
		
		//Creating a object of Character
		Character obj9 = Character.valueOf('A');
		
		//Creating a object of Boolean
		Boolean obj10 = Boolean.valueOf("true");
	}	
	
}