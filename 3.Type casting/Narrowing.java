class Narrowing{               //Narrowing type casting converting to a higher data type to lower data type 
	public static void main(String args[]){
		
		long l  = 1245367896;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		double d= (double)b;
		float f = (float)d;
		
		System.out.println("Long value: "+l);
		System.out.println("Long to integer: "+i);
		System.out.println("Integer to short: "+s);
		System.out.println("Short to byte: "+b);
		System.out.println("Byte to double: "+d);
		System.out.println("Double to float: "+f);
	}
}