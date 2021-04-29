package sec0;

public class PromotionExapmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue= 10;
		int intValue = byteValue; // int <- Byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // int <- long
		System.out.println(longValue);
		
		intValue =200;
		double doubleValue = intValue;//int <- double
		System.out.println(doubleValue);
	}

}
