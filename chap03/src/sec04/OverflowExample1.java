package sec04;

public class OverflowExample1 {

	public static void main(String[] args) {
		int x = 100000000;
		int y = 100000000;
		int z = x * y;
		System.out.println(z);
		
		long a = 100000000;
		long b = 100000000;
		long c = a * b;
		System.out.println(c);
		
	}

}
