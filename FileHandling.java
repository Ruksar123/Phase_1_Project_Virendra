package FileHandling.program;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandling {
		  public static void main(String args[]) {

		    String data = "java is easiest programming language";
		   
		    try {
		      // Step 1: Creates a Writer using FileWriter
		      FileWriter output = new FileWriter("C://Users//USER//Desktop//File Handling//file.txt");

		     
		      // Step 2: Writes string to the file
		      output.write(data);
		      System.out.println("Code is written to the file.");

		      // Step 3: Closes the writer
		      output.close();
		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }

		char[] array = new char[60];
		   
		    try {
		      // Step 1: Creates a reader using the FileReader
		      FileReader input = new FileReader("C://Users//USER//Desktop//File Handling//file.txt");

		      // Step 2: Reads characters
		      input.read(array);
		     
		      System.out.println("Code in the file:");
		      System.out.println(array);

		      // Step 3: Closes the reader
		      input.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }

		 }
		}

