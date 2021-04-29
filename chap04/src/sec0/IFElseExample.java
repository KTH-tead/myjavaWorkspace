package sec0;

public class IFElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90 보다 큽니다");
			System.out.println(" 등급은 A 입니다.");
		} else {
			System.out.print("점수가 90보다 작습니다");
			System.out.print(" 등급은 B 입니다.");
		}
	}
}
