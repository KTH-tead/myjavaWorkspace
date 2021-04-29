package sec0;


//자바 프로그램은 반드시 클래스 안에 작성해야 한다. 
//하나의 클래스는 여러개의 메소드를 포함할 수 있다. 
//실행클래스는 main 메소드가 포함된 클래스이며
//참조클래스는 main 메소드 없이, 다른 클래스가 호출하여 사용되는 클래스입니다.

//static int score 1

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 =15;
		if(v1>10) {
			int v2 = v1 - 10;
			int v3 = v1 + v2 + 5; // v2변수를 사용할 수 없기 때문에 컴파일 에러가 생김.
			System.out.println(v3); //억지로 추가함.
		}

	}
}