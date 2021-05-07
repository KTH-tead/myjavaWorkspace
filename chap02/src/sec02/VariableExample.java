package sec02;


//자바 프로그램은 반드시 클래스 안에 작성해야 한다. 
//하나의 클래스는 여러개의 메소드를 포함할 수 있다. 
//실행클래스는 main 메소드가 포함된 클래스이며
//참조클래스는 main 메소드 없이, 다른 클래스가 호출하여 사용되는 클래스입니다.

//static int score 1


public class VariableExample {
	public static void main(String[] args) {
		int value =10; // 10을 변수 Value의 초기값으로 저장
		int result = value +10; //변수 value 값을 읽고 10을 더하는 산술 연산을 수행.
		// 연산의 결과값을 변수 result의 초기값으로 저장.
		System.out.println(result); // 변수 result 값을 읽고 콘솔에 출력.
	}
	
}


// System.out.println("Hello, welcome to the java world!"+ result);
// System.out.println("환영합니다 자바를 열심히 자바 봅시다");
 
 //
// System.out.println("welcome/" "/ //to// java world!!!");
// 
