package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class M150_EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		if (tokens == null || tokens.length == 0)
			return -1;
		Deque<Integer> stack = new ArrayDeque<>();
		for (String s : tokens) {
			switch (s) {
			case "+":
				stack.push(stack.pop() + stack.pop());
				break;
			case "-":
				stack.push(-stack.pop() + stack.pop());
				break;
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "/":
				int num2 = stack.pop();
				int num1 = stack.pop();
				stack.push(num1 / num2);
				break;
			default:
				stack.push(Integer.valueOf(s)); // return Integer
				// stack.push(Integer.parseInt(s)); // return int
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
