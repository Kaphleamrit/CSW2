import java.util.HashMap;
import java.util.Stack;

public class BalanceBrackets {
	public static void main(String[] args) {
		System.out.println(isBalanced("[{) }]"));
	}

	public static boolean isBalanced(String s) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put(']', '[');
		map.put('}', '{');
		map.put(')', '(');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);

			if (curr == '[' || curr == '{' || curr == '(') {
				stack.push(curr);
			} else {
				if (map.get(curr) == stack.peek())
					stack.pop();
				else
					return false;
			}
		}
		return true;
	}

}
