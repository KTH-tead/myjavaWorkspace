package sec08;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동& 이수홍,박연수,김자바--최명호 신상현";
		
//		String [] names = text.split("&|,|-");
		
		String [] names = text.split("[-&,\\s]+");
		
		for (String name :names) {
			System.out.println(name);
		}
	}

}
