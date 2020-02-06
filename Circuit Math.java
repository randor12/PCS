import java.util.*;
import java.util.HashMap;
import java.util.Stack;

public class CircuitMath {
    public static void main(String[] args) {
        String input = "4\nT F T F\nA B * C D + - +"; //Figure out how input works
        HashMap<String,Boolean> map = new HashMap<String,Boolean>();
        Stack<Boolean> stack = new Stack<Boolean>();
        //We first read the second line and store it into a Map<String, bool>
        Scanner scanner = new Scanner(input); 
        Scanner second = new Scanner(scanner.nextLine());
        Scanner third =  new Scanner(scanner.nextLine());
        int startPoint = 65; 
        while (second.hasNext()) {
            
        }
        //Then we create a Stack<bool> and do operators like that 
        
    }
}