package packerino;

import java.util.Scanner;

public class TheMain {
	public static void main(String[] args){
		while(true) {
    	
			System.out.println("Please enter the Severity of the area or the word you need defined.");
			Scanner scan = new Scanner(System.in);
	    	 
			// Reads a single line from the console 
		    // and stores into name variable
		    String inpu = scan.nextLine();
		    //scan.close(); //This just closes the scanner so it does not mem leak, but cannot be used again in the while
		       
		    stablerino.teired(inpu);
		}
	}
}

