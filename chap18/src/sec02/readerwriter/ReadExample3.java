package sec02.readerwriter;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/myjavaDev/myjavaWorkspace/test.txt");
		
		int readCharNo1;
		int readCharNo2;
		char[] cbuf = new char[4];
		
		//readCharNo1 = reader.read(cbuf);
		readCharNo1 = reader.read(cbuf, 0, 2);
		
		for (int i=0; i<cbuf.length; i++) {
			//System.out.println(cbuf[i]);
			System.out.println(readCharNo1 + "cbuf[" + i + "]: " +cbuf[i] );
		}
		
		reader.close();
	}

}

