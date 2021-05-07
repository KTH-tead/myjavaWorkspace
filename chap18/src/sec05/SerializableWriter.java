package sec05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream ("C:\\myjavaDev\\myjavaWorkspace\\object1.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA classA = new ClassA();
		classA.field1 =1;
		classA.field2.field1 =2;
		ClassA.field3 =3;
		ClassA.field4 =4;
		oos.writeObject(classA);
		oos.flush();oos.close();fos.close();
		
	}

}
