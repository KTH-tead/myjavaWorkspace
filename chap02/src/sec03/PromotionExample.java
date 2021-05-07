package sec03;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // byte -> int
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // char -> int
		System.out.println("가의 유니코드 :" + intValue);
				
		intValue = 500;
		long longValue = intValue; // int -> long
		System.out.println(longValue);
				
		intValue = 200;
		double doubleValue = intValue; //double -> int
		System.out.println(doubleValue);
	}

}
