package sec0;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doublValue =3.14;
		intValue = (int) doublValue;
		System.out.println(intValue);
	}

}
