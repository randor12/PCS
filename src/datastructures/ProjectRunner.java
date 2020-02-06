/**
 * 
 */
package datastructures;

import java.io.File;
import java.util.*;

/**
 * @author randor
 *
 */
public class ProjectRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("data.txt");
		Scanner input;
		try {
			input = new Scanner(f);
			int numInputs = input.nextInt();
			boolean[] variables = new boolean[numInputs];
			// Loop through to initialize all the variables
			for (int i = 0; i < numInputs; i++) {
				variables[i] = input.next().equals("T") ? true : false;
			}
			String equation = "";
			while (input.hasNext()) {
				equation += input.next();
			}

		} catch (Exception e) {
			System.out.println("File not found exception");
		}

	}

}
