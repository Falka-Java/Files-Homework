package models;
import java.io.Serializable;  
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String FIO;
	private int age;
	private String JobTitle;
	
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFIO() {
		return FIO;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
	
	public Employee(String FIO, int age, String JobTitle) {
		this.FIO = FIO;
		this.age = age;
		this.JobTitle = JobTitle;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return FIO + " " + age + " " + JobTitle;
	}
	

}
