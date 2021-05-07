package sec04;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\myjavaDev\\myjavaWorkspace\\chap18\\src\\sec04\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) !=-1) {
			String data = new String (cbuf,0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
