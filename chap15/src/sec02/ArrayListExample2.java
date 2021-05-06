package sec02;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) { 
		List<String> list1 = Arrays.asList("홍길동", "신용권","김자바");
		for(String name: list1) {
			System.out.println(name);
		}
		
		
		list1.add("신상현");
		list1.remove("홍길동");
		
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for (int value : list2) {
			System.out.println(value);
		}
	}
	
}



