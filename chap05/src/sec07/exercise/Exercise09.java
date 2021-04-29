package sec07.exercise;

//9. 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서,
//최고 점수 및 평균 점수를 구하는 프로그램입니다. 실행 결과를 보고, 
//알맞게 작성해보세요(참고로 16라인에서 Scanner의 nextInt()
//		메소드는 콘솔에 입력된 숫자를 읽고 리턴합니다).


import java.util.Scanner; //Scanner cannot be resolved to a type 이라는 에러 보고 빠진거 확인


public class Exercise09 {

	 public static void main(String[] args) {
	        boolean run = true;
	        int studentNum = 0;
	        int[] scores = null;
	        Scanner scanner = new Scanner(System.in);
	 
	        while(run) {
	            System.out.println("-----------------------------------------------------");
	            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
	            System.out.println("-----------------------------------------------------");
	            System.out.print("선택> ");
	 
	            int selectNo = scanner.nextInt();
	 
	            if(selectNo == 1) {
	 
	                System.out.print("학생수> ");
	                studentNum = scanner.nextInt(); 
	                scores = new int[studentNum];
	 
	            } else if(selectNo == 2) {
	 
	                for (int i = 0; i < studentNum; i++) {
	                    System.out.print("scores[" + i + "번째 학생]> "); 
	                    scores[i] = scanner.nextInt(); // 학생 배열 순서 마다 점수 기입
	                }
	 
	            } else if(selectNo == 3) {
	                for (int i =0; i<studentNum; i++) {
	                	System.out.println("scores[" + i + "]:" + scores[i]); // 학생 순서 + 기입한 점수
	                }
	 
	            } else if(selectNo == 4) {
	                int max = 0;
	                int sum = 0;
	                double avg = 0.0;
	                for (int i =0; i<studentNum; i++) {
	                	if(scores[i] > max) { //0 보다 큰 모든 값이면 나오고 
	                		max = scores[i];  // 배열 중 가장 큰 값을 max로 지정.
	                	}
	                	sum += scores[i]; // 배열에 맞는 점수 합
	                }
	                avg = (double) sum / studentNum; // 
	                
	                System.out.println("최고점수 : " + max); //  max 점수 나오도록.
	                System.out.println("평균점수 : " + avg); //  max 점수 나오도록.
	 
	            } else if(selectNo == 5) {
	                run = false;
	            }
	        }
	 
	        System.out.println("프로그램 종료");
	        scanner.close();
	    }
}
