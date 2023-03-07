package services;

import java.io.Serializable;
import java.util.LinkedList;

import models.Employee;

public class DataService implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5327482517607007669L;
	
	private LinkedList<Employee> employers;
	
	public DataService() {
		employers = new LinkedList<Employee>();
	}
	public void addEmployee(Employee emp) {
		employers.add(emp);
	}
	public Employee getEmployee(int index) {
		if(!(employers.size()<=index) && index >=0)
			return employers.get(index);
		return null;
	}
	public boolean removeEmployee(int index) {
		if(!(employers.size()<=index) && index >=0) {
			employers.remove(index);
			return true;
		}
		return false;
	}
	public int getLength() {
		return employers.size();
	}
	public LinkedList<Employee> getEmployeeList(){
		return employers;
	}
}
