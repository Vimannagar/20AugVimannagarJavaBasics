package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategoryException {
	
	
	
	public static void main(String[] args) {
		
		String filepath = "F:\\Desktop\\VimanNagar\\20 Aug\\Java basics.docx";
	
		try {
			
		FileInputStream fis = new FileInputStream(filepath);
		
		System.out.println("Last line of try block");
		}
		
		catch (FileNotFoundException e) {
			
			System.out.println("file not found exception arrive");
		
		}
		
		
		
		
		
	}

}
