package Exercise;
//5. 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)의 형태로 출력해보세요.
//단, x와 y는 10이하의 자연수입니다.
public class Exercise05 {
<<<<<<< HEAD
    public static void main(String[] args) {
        int x;
        int y;

        for (x = 1; x<= 10 ; x++) {
            for (y = 1; y<=10 ; y++) {
                if ((4*x + 5*y) == 60) // x는 4씩 늘어나고 y는 5씩 늘어나게 하고, 그 결과값이 60이 되는 x와 y깁찾기.
                    System.out.println("("+ x +"," + y +")");

            }
        }

    }
=======
	public static void main(String[] args) {
		int x;
		int y;
		
		for (x = 1; x<= 10 ; x++) {
			for (y = 1; y<=10 ; y++) {
				if ((4*x + 5*y) == 60) // x는 4씩 늘어나고 y는 5씩 늘어나게 하고, 그 결과값이 60이 되는 x와 y깁찾기.
					System.out.println("x :"+ x +", y:" + y);
				
			}
		}
			
	}
>>>>>>> f1a5ceb9e2e8ad093918602d0d0c7f2d5a55ee97
}
