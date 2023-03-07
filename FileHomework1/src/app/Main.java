package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Scanner file1Reader = null;
		Scanner file2Reader = null;
		try {
			//Opening files
			System.out.print("Enter path to the first file: ");
			File file1 = new File(sc.nextLine());
		    file1Reader = new Scanner(file1);

			System.out.print("Enter path to the secound file: ");
			File file2 = new File(sc.nextLine());
		    file2Reader = new Scanner(file2);
		
		    int currentLine = 0;
			while(file1Reader.hasNextLine()) {
				String line1 = file1Reader.nextLine();
				if(!file2Reader.hasNextLine())
					break;
				String line2 = file2Reader.nextLine();
				
				if(!line1.equals(line2)) {
					System.out.printf("Line %d is different!\n %s <-> %s\n",currentLine,line1,line2);
				}
				currentLine++;
				
			}
			
		}catch(IOException ex) {
			System.out.println("IOException occured!\n" + ex.getMessage());
		}finally {
			if(file1Reader !=null)
				file1Reader.close();
			if(file2Reader != null)
				file2Reader.close();
		}
		
		System.out.println("\nProgramm end");
		
	}

}
