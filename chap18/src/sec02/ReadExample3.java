package sec02;

import java.io.FileInputStream;
import java.io.InputStream;


public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/myjavaDev/myjavaWorkspace/test.txt");
		
		int readByteNo;
		
		String data = "";
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 0, 8);
		readByteNo = is.read(readBytes, 0, 8) ;
		for (int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
//			data += new String(readBytes, 0, readByteNo, "UTF-8");
//			System.out.println(data);
		} 
//		while (true) {
//			readByteNo = is.read(readBytes,0,8);
//		}
		
		is.close();
	}

}
