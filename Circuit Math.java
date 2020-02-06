import java.util.*;

public class CircuitMath {
    public static void main(String[] args) {
        HashMap<Character,Boolean> map = new HashMap<Character,Boolean>();
        Stack<Boolean> stack = new Stack<Boolean>();
        //We first read the second line and store it into a Map<String, bool>
        Scanner scanner = new Scanner(System.in); 
        
        scanner.nextLine();
        Scanner second = new Scanner(scanner.nextLine());
        Scanner third =  new Scanner(scanner.nextLine());
        int startPoint = 65; 
        
        while ( second.hasNext()) {
            char current = (char)startPoint; 
            String value = second.next(); 
            if (value.equals("T")) {
                map.put(current, true);
            }
            else if (value.equals("F"))
            {
                map.put(current, false);
            }
            startPoint++;
        }
        
        //Then we create a Stack<bool> and do operators like that 
        while (third.hasNext()) {
            String op = third.next(); 
            if (map.containsKey(op.charAt(0))) //We know the letter is a character
            {
                stack.push( map.get(op.charAt(0)) );
            }
            else if (op.equals("*")) {
                stack.push( stack.pop() && stack.pop() );
            }
            else if (op.equals("+")) {
                stack.push( stack.pop() || stack.pop() );
            }
            else if (op.equals("-")) {
                stack.push( !stack.pop() );
            }
        }
        if (stack.pop()) {
            System.out.println("T");
        }
        else {
            System.out.println("F");
        }
        
    }
}