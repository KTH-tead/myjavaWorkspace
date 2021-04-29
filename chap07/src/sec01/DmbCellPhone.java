package sec01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	

	
	//메소드
	
	DmbCellPhone(String model,String color, int Channel) {
		super(model,color);
		this.model = model;
		this.color = color;
	}
	
//	public DmbCellPhone(String model,String color) {
//		super(model,color);
//		this.model = model;
//		this.color = color;
//	}

	void turnOnDmb( ) {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다");
	}
	void changeChannel( ) {
		System.out.println("채널 : " + channel + "번 으로 바꿉니다");
	}
	void turnOffDmb( ) {
		System.out.println("DMB 방송 수신을 종료합니다");
	}
}
