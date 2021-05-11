package sec03;

public class WhilePrintFrom1ro100Example {

	public static void main(String[] args) {
		int sum =0;
		
		int i =0;
		while (i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) +"합 :" +sum);
	}

}
