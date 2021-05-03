package sec07.exercise;

public class Exercise08 {

	public static void main(String[] args) {
		 int[][] array = {
		            {95, 86},
		            {83, 92, 96},
		            {78, 83, 93, 87, 88}
		        };
		        //다차원 배열... 몰랐는데.. 공부...
		 
		        int sum = 0;
		        double avg = 0.0;
		 
		 
		        // 답
		        
		        int leng = 0;
		        
		        for (int i= 0; i<array.length; ++i) { //행 배열 3번  반복
		        	for (int j= 0; j<array[i].length; j++) { //각 행에 맞는 열에 소속된 배열 개수만큼 반복 // 웹 검색...
		        		sum += array[i][j]; // 1행 1열 ~ 3행 5열까지 합산
		        	}
		        	leng += array[i].length; // 
		        }
		        avg =  (double) sum / leng;

		 
		        System.out.println("sum: " + sum);
		        System.out.println("avg: " + avg);
	}

}
