package app;

import services.MenuService;
import services.OperationService;

import java.util.Scanner;


public class Main {
	private final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		OperationService op = new OperationService();
		MenuService menu  = new MenuService();
		
		int choice = 0;
		do {
			menu.displayMenu();
			choice = menu.getChoice();
			switch(choice) {
				case 0:
					op.saveAll();
					break;
				case 1:
					op.displayAllEmployees();
					break;
				case 2:
					op.addNewEmployee();
					break;
				case 3:
					op.displayEmployeeByIndex();
					break;
				case 4:
					op.removeEmployeeByIndex();
					break;
				case 5:
					op.findEmployeeByFio();
					break;
				case 6:
					op.modifyEmployee();
					break;
				case 7:
					op.showEmployeeByAge();
					break;
				default:
					break;	
			}
			System.out.println("\nPress enter to continue");
			sc.nextLine();
			
		}while(choice != 0);
		
		System.out.println("Programm end");
	}

}
