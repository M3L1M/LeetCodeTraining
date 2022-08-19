package leetcode.easy;

import java.util.Stack;

public class Ex20_Valid_Parentheses {
	public static void main(String[] args) {
		System.out.println(isValid("({})"));
	}
	
	public static boolean isValid(String s) {
		 if(s.length() % 2 != 0) return false;
	        
	        Stack<Character> stack = new Stack();
	        for(char c: s.toCharArray()) {
	            if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	            	System.out.println(c);
	                stack.pop();
	            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            }else{
	                stack.push(c);
	            }
	        }
	        return stack.isEmpty();
		
    }
	
}
