package services;

import java.util.Scanner;

public class MenuService {
	private Scanner sc = new Scanner(System.in);
	public void displayMenu() {
		System.out.println("1 - Show all emplpoyees");
		System.out.println("2 - Add employee");
		System.out.println("3 - Show employee details by index");
		System.out.println("4 - Remove employee by index");
		System.out.println("5 - Show employees by FIO");
		System.out.println("6 - Modify employee");
		System.out.println("7 - Show employees by age");
		System.out.println("0 - Save & exit");		
	}
	
	public int getChoice() {	
		while(true) {
			try {
				System.out.print("Enter your choice: ");
				return Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException nfe) {
				System.out.println("You need to enter a number, please try again");
			}
			
		}
	}
}
