package sec02.p347;

public class RemoteControlExample {

	public static void main(String[] args) {
		
//		//인터페이스 유형 변수에 구현객체 클래스를 대입.
		RemoteControl rc;
		rc = new Television();
		
//		// 실행
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
//		// 다형성 
		
		RemoteControl rc = new RemoteControl() { //인터페이스의 생성자 x, 인터페이스의 구현객체를 재 정의.
			public void turnOn(){/*실행문*/}
			public void turnOff(){/*실행문*/}
			public void setVolume(int volume){/*실행문*/}
			
		};
		

	}

}
