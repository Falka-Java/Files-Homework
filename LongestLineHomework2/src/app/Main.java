package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner file1Reader = null;
		
		try {
			System.out.print("Enter path to the file: ");
			File file1 = new File(sc.nextLine());
			file1Reader = new Scanner(file1);
			
			long maxLength = 0;
			while(file1Reader.hasNextLine()) {
				long currentLineLength = file1Reader.nextLine().length();
				if(maxLength < currentLineLength)
					maxLength = currentLineLength;
			}
			
			System.out.printf("Max length is %d\n",maxLength);
			
		}catch(IOException ex) {
			System.out.println("IOException occured!\n" + ex.getMessage());
		}finally {
			if(file1Reader !=null)
				file1Reader.close();
		}
		
		System.out.println("\n Programm end");
	}

}
