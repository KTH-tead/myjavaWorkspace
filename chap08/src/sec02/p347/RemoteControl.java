package sec02.p347;

public interface RemoteControl {
	
	//상수
	
	public int MAX_VOLUME = 10;//
	public int MIN_VOLUME = 0;
	
	//추상 클래스
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume); 
//	public void mute(int volume);
	
	//디폴트 메소드 
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else  {
			System.out.println("무음 해체합니다.");
		}
			
	}
	
	//정적 메소드
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
	
}
