package intro.ex01;

public class Person {

	//1. 필드 (클래스 변수, Person 클래스의 속성)
	
	public String name; 
	private String phoneNumber = "000-0000-0000";
	int age = 1;
	public String email ;
	
	//	name ="신상현";
	
	//	2. 생성자(****). // 반드시 필요~!!
	 public Person() {
		 System.out.println("기본생성자(NoArgsConstructor)를 사용함");
	 }
	 
	 //private Person(String name, String phoneNumber, int age, String email)
	 public Person(String name, String phoneNumber, int age, String email) {
		 this.name = name; // 이 객체라는 것을 강조하기 위해서 this 사용.
		 this.phoneNumber = phoneNumber;
		 this.email = email;
		 System.out.println("모든 필드를 매개변수로 갖는 생성자 (AllArgsConstructor)가 사용됨");
	 }
	 
	 
	//3. 메소드
	//반환값(리턴타입)이 있는 메소드 : return 실행문이 포함됨.
	//반환값(리턴타입)이 없는 메소드 : return 실행문이 포함될 수도 있고, 안됧 수도 있음.
	 
	 public int returnAge(){ //선언부
//		 int myAge = this.age;
		 System.out.println("객체에 설정된 나이 : " + this.age);
		 return this.age;// 명시된 값을 호출한 메소드에 반환하고 이 메소드를 종료합니다.
	}
	 
	 public void returnName() {
		 System.out.println("객체에 설정된 이름 : " + this.name);
	 }
	

	public void returnName2() {
		 System.out.println("객체에 설정된 이름 : " + this.name);
		 return;
	 }
	
	 public String getPhoneNumber() {
		 
		 if(this.phoneNumber == null) {
			 
			 this.phoneNumber = "3333-3333";
		 } 
		 return this.phoneNumber;
	 }
}
