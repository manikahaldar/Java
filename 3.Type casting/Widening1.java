class Widening{               //Widening type casting converting to a lower data type to higher data type 
	public static void main(String args[]){
		
		byte b = 127;       // If the value of byte is out of range then it shows error, So always put the value of byte is -128 to 127
		short s = (short)b;
		int i = (int)s;
		long l = (long)i;
		double d = (double)l;
		float f = (float)d;
		
		System.out.println("Byte value: "+b);
		System.out.println("Byte to short: "+s);
		System.out.println("Short to integer: "+i);
		System.out.println("Integer to long: "+l);
		System.out.println("Long to double: "+d);
		System.out.println("double to float: "+f);
	}
}