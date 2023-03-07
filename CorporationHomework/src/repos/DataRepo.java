package repos;

import services.DataService;


public class DataRepo {
	//
	private String fileName;
	private DataService archive;
	private MySerializer ms;
	
	public DataService getArchive() {
		return archive;
	}
	
	public DataRepo() {
		fileName = "archive.dat";
		ms = new MySerializer();
		loadArchive();
	}
	
	public void saveArchive() {
		ms.serialize(archive, fileName);
		System.out.println("Archive was saved successfully");
	}
	
	public void loadArchive() {
		archive = (DataService) ms.deserialize(fileName);
		System.out.println("Archive was loaded successfully");
	}
	
}
