public class App {
	public static void main(String args[]) {
		
		byte byteValue = 20;
		short shortValue = 56;
		int intValue = 889;
		long longValue = 23355;
		
		float floatValue = 8834.8f;
		float floatValue2 = (float)12.8;  //another syntax
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = intValue; 
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		// The following won't work as we expect it to!!
		//128 is too big for byte.
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}

}
