package sec02.p1000.write;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/myjavaDev/myjavaWorkspace/test33.txt");
		
		byte [] data1 = "ABC\r\nDEF\r\n".getBytes(); //줄바꿈 됨.
		//byte [] data1 = "ABC\r\nDEF".getBytes(); //줄바꿈 안됨.
		byte[] data2 = "자바를 열심히 복습하세요".getBytes();
		os.write(data1);
		os.write(data2);
		os.flush();
		os.close();
	}

}
