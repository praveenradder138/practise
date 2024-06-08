package dsa;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {

		String str = "([{({}){}])";

		Stack<Character> stack = new Stack<>();

		for (Character c : str.toCharArray()) {

			if (stack.size()>0 && stack.peek().equals('(') && c.equals(')')) {
				stack.pop();
			} else if (stack.size()>0 && stack.peek().equals('{') && c.equals('}')) {
				stack.pop();
			} else if (stack.size()>0 && stack.peek().equals('[') && c.equals(']')) {
				stack.pop();
			} else {
				stack.push(c);
			}

		}

		System.out.println(stack.isEmpty());
	}

}
