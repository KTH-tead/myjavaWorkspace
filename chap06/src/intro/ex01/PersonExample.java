package intro.ex01;

public class PersonExample {

	public static void main(String[] args) {
		Person myPerson1 = new Person(); // 객체 생성.
		// name, email:null
		//a
		
//		myPerson1.phoneNumber ="222-2222-2222"; privae 접근제어 때문에 컴파일 오류.
		myPerson1.age = 17;
		System.out.println("이름: " + myPerson1.name);
		System.out.println("나이: " + myPerson1.age);
//		Person.age = 35;
		
		
		Person myPerson2 = new Person("신상현", "555-5555-5555", 45, "구트@구트닷컴");
		
		//String myPhoneNumber = myPerson2.phoneNumber; //The field Person.phoneNumber is not visible
		String myPhoneNumber = myPerson2.getPhoneNumber();  //getter setter
		System.out.println("myPerson2.PhoneNumber" + myPhoneNumber);
		
		
//		Person myperson3 = new Person("신상현"); // 컴파일 오류, person 생성자가 없어서
		

	}

}
