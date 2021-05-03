package sec07.exercise;

public class Exercise07 {
	    public static void main(String[] args){
	    	
	    	
	    	
	        int max=0;
	        int[] array={1,5,3,8,2};
	        //작성 위치
	        for (int i=0; i<array.length; i++) { // length 길이에 맞춰서 5번 돌림
	        	if (array[i]>max) // max 함수 본적이 없었던것 같은데... 웹 도움으로 찾음.
	        		max=array[i];
	        }
	        
	        System.out.println(max);
	    }
}
