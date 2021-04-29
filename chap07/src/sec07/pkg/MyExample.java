package sec07.pkg;

public class MyExample {

	public static void main(String[] args) {
		Child01 myChild01 = new Child01();
		Child02 myChild02 = new Child02();
		
		int a = myChild01.childField01;
		System.out.println(a);
		
		myChild02.method03();
		myChild02.methodChild02();
		myChild01.methodChild01();
		
		myChild01.mymethod();
		myChild02.mymethod();
		
		Parent myParent01 = new Parent();
		
		//
		Parent myParent02 = new Child01();
		Parent myParent03 = new Child02();
		
		//
		Parent myParent = new Child01();
		myParent = new Child02();
		// 부모타입에서 자식의 타입을 변경할 수 있음. interface에서.... 다시 설명.

	}

}
