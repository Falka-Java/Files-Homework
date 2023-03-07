package repos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import services.DataService;

public class MySerializer {
	public void serialize(DataService archive, String fileName) {
		try {
		  FileOutputStream fout = new FileOutputStream(fileName);   
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(archive);
		  out.flush();
		  out.close();
		  System.out.println("File saved!");
		}catch(IOException io) {
			System.out.println("File saving error!");
		}
		  
	}
	public DataService deserialize(String fileName) {
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		DataService result = (DataService)in.readObject();
		in.close();
		
		return result;
		}catch(IOException io) {
			System.out.println("Loading error! Is file exist?");
			return new DataService();
		}catch(ClassNotFoundException io) {
			System.out.println("Loading error! Is archive exist?");
			return new DataService();
		}
		
	}
}
