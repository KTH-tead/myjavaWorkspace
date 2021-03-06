package sec07.pkg;

public class MyExample {

	public static void main(String[] args) {
		
//		Parent myParent = new Parent();
//		
//		
//		Child01 myChild01 = new Child01();
//		Child02 myChild02 = new Child02();
//		
//		int a = myChild01.childField01;
//		
//		myChild02.method03();
//		myChild02.methodChild02();
//		myChild01.methodChild01();
//
//		myChild01.myMethod();
//		myChild02.myMethod();

		
		//부모타입변수의 자식 객체를 대입
		//부모클래스에만 있는 맴버는 사용가능
		//자식클래스에 재정의된 메소드 사용됨.
		// 부모클래스의 메소드 중 자식에서 재정의 된 메소드는 사용못함
		// 자식객체만 선언된 메소드나 필드는 사용못함	
		Parent myParent01 = new Child01();

		int plnt = myParent01.myField; //parernt의 myField
		myParent01.myMethod(); // 자식클래스에 재정의 된 메소드 사용
		
		// 자식에게만 있는 메소드는 사용 못함(오류난 이유)
		// myParent01.methodChild01; //자식에게만 있는 메소드(ㅍㄹ드도 포함)
		
		// 자식에게만 정의된 메소드를 사용하는 방법(Casting)
		//자식 클래스 유형 병수에 해당 자식객체가 할당된 부모타입 변수를 
		// 자식 타입으로 캐스팅
		Child01 myChild001 = (Child01) myParent01;
		
		//자식에게 있는 메소드를 사용할 수 있습니다.
		int child01Field = myChild001.childField01;
		myChild001.methodChild01();
		myChild001.myMethod();
		
		int parentField = myChild001.myField;
		 System.out.println("parentField:" + parentField);
		 
		 // 캐스팅 시 주의할 사항
		 // myParent01에는 child01 객체가 저장됨.
		 //Child02 타입 변수로 캐스팅 할 수 없습니다.
		 // 컴파일 오류가 아니라 실행시 오류가 발생.
		 // Child02 my Child002 = (Child02) myParent01;
		 
	      //Exception in thread "main" java.lang.ClassCastException: 
	      //sec07.pkg.Child01 cannot be cast to sec07.pkg.Child02
	      //at sec07.pkg.MyExample.main(MyExample.java:52)
		
		 // 오류 해결 코드
		 
		 Child01 myChild0001 = null;
		 Child02 myChild0002 = null;
		 
		 
		 if (myParent01 instanceof Child01) {
			 myChild0001 = (Child01) myParent01;
		 } else if ( myParent01 instanceof Child02) {
			 
			 myChild0002 = (Child02) myParent01;
			 // return;
		 } else {
			 System.out.println("저장객체가 Child01/Child02 타입의 객체가 아닙니다.");
		 }
		 
		 myChild0001.methodChild01();
		
		 if (myChild0001 != null) {
	          myChild0001.methodChild01();
	       } else if (myChild0002 != null) {
	          myChild0002.methodChild02();
	       } else {
	          return ;
	       }

		 
		 //myParent01 = new child02();
		
		
	}

}
