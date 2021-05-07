package sec05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersonUIDExample2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\myjavaDev\\myjavaWorkspace\\object2.data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1:" + classC.field1);
		
	}

}
