package sec03;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" +result1);
		System.out.println("resylt2=" +result2);
		
		short s = 100;
		//short result3 = -s // 컴파일 에러
		int result3 = -s;
		System.out.println("result3=" +result3);
		
	}

}