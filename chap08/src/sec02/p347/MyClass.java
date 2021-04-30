package sec02.p347;

public class MyClass {
	//필드 
//	private RemoteControl rc;
	RemoteControl rc = new Television ();
	//RemoteControl rc // 하나밖에 없기 때문에....?
	
	//생성자
	public MyClass(RemoteControl rc) {
//		super();// extends 안썼기 때문.
		this.rc = rc;
	}
	
	// getter setter 
		public RemoteControl getRc() {
			return rc;
		}
		public void setRc(RemoteControl rc) {
			this.rc = rc;
		}

		
	//메소드
	void methodA() {
		RemoteControl rc = new Audio(); 		//로컬 변수 선언
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		
	}
	public static void main(String[] args) {
	
		MyClass myclass = new MyClass(new Televsion()); // 매개 값- interface 타입에는 구현 개체 넣어야 함.
		//다른 클래스 (예, main()가 있는 클래스에서 MyClass와 method를 사용할 때는 다음처럼 코드 작성.
		myClass.methodB(new Audio());
	}
	

	
}  