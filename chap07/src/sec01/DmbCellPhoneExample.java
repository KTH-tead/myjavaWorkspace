package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone DmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델:" +DmbCellPhone.model);
		System.out.println("색깔:" +DmbCellPhone.color);
		
		//DmbcellPhone의 필드
		System.out.println("채널:" +DmbCellPhone.channel);
		
		//CellPhone으로부터 상속바은 메소드 호출
		DmbCellPhone.powerOn();
		DmbCellPhone.bell();
		DmbCellPhone.sendVoice("여보세요");
		DmbCellPhone.receiveVoice("안녕하세요, 저는 홍길동인데요.");
		DmbCellPhone.sendVoice("아, ~예 반갑습니다");
		DmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		DmbCellPhone.turnOnDmb();
		DmbCellPhone.changeChannel();
		DmbCellPhone.turnOffDmb();		
	}

}
