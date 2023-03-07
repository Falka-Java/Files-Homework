package services;

import java.util.Scanner;

import models.Employee;
import repos.DataRepo;

public class OperationService {
	private Scanner sc = new Scanner(System.in);
	private DataRepo dr;
	private DataService archive;
	
	public OperationService() {
		dr = new DataRepo();
		archive = dr.getArchive();
	}
	
	public void saveAll() {
		dr.saveArchive();
	}
	
	public void displayAllEmployees() {
		for(int i = 0; i < archive.getLength(); i++) {
			System.out.println(archive.getEmployee(i));
		}
	}
	
	public void displayEmployeeByIndex() {
		System.out.print("Enter employee index: ");
		System.out.println(archive.getEmployee(Integer.parseInt(sc.nextLine())));
	}
	
	public void findEmployeeByFio() {
		System.out.print("Enter employee fio: ");
		String fio = sc.nextLine();
		for(Employee item : archive.getEmployeeList()) 
			if(item.getFIO().startsWith(fio)) 
				System.out.println(item);	
	}
	
	public void addNewEmployee() {
		System.out.print("Enter employee fio: ");
		String fio = sc.nextLine();
		System.out.print("Enter employee age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Enter employee job title: ");
		String jobTitle = sc.nextLine();
		
		Employee newEmp = new Employee(fio, age, jobTitle);
		archive.addEmployee(newEmp);
		dr.saveArchive();
	}
	
	public void removeEmployeeByIndex() {
		System.out.print("Enter employee index: ");
		if(archive.removeEmployee(Integer.parseInt(sc.nextLine()))) {
			System.out.println("Employee deleted successfully!");
		}else
			System.out.println("Employee was not finded!");
		
	}
	
	public void modifyEmployee() {
		System.out.print("Enter employee index: ");
		Employee emp = archive.getEmployee(Integer.parseInt(sc.nextLine()));
		if(emp==null) {
			System.out.println("Employee was not finded!");
			return;
		}
		System.out.print("Enter new fio: ");
		String fio = sc.nextLine();
		System.out.print("Enter new age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Enter new job title: ");
		String jobTitle = sc.nextLine();
		
		emp.setFIO(fio);
		emp.setAge(age);
		emp.setJobTitle(jobTitle);
		dr.saveArchive();
		System.out.println("Employee successfully modified");
	}
	
	public void showEmployeeByAge() {
		System.out.print("Enter employee age: ");
		int age = Integer.parseInt(sc.nextLine());
		for(Employee item : archive.getEmployeeList()) 
			if(item.getAge() == age) 
				System.out.println(item);
	}
	
}
