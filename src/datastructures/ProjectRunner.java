/**
 * 
 */
package datastructures;

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
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		Stack<Boolean> stack = new Stack<Boolean>();
		boolean[] in = new boolean[num];

		for (int i = 0; i < num; i++) {
			String s = input.next();
			if (s.equals("T")) {
				in[i] = true;
			} else {
				in[i] = false;
			}
		}

		while (input.hasNext()) {
			String val = input.next();
			char character = val.charAt(0);
			if (Character.isAlphabetic(character)) {
				stack.push(in[character - 'A']);
			} else {
				if (character == '-') {
					boolean fromStack = stack.pop();
					stack.push(!fromStack);
				} else if (character == '+') {
					boolean from1 = stack.pop();
					boolean from2 = stack.pop();
					stack.push(from1 || from2);
				} else {
					boolean from1 = stack.pop();
					boolean from2 = stack.pop();
					stack.push(from1 && from2);

				}
			}
		}

		System.out.println(stack.pop() ? "T" : "F");

		input.close();

	}

}
