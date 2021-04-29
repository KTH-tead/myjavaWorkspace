package sec07.pkg;

public class Child01 extends Parent {
	int childField01 = 10;
	
	void methodChild01 () {
		System.out.println("자식 1 클래스의 메소드 1");
	}
	
	void mymethod() {
		System.out.println("부모에 있는메소드를 재정의");
	}
}
