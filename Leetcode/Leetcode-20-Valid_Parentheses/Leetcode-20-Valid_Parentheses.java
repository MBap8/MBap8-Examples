import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String brackets = "([]";
		boolean result = sol.isValid(brackets);
		System.out.println(result);
		
	}
}
class Solution {
	public boolean isValid(String s) {
		Stack<Character> res = new Stack<Character>();
		boolean result = false;
		int iteratorAdd = 0;
		
		for (Character c : s.toCharArray()){
			iteratorAdd++;
			if (OpenBracket(c)){
				if (iteratorAdd == s.toCharArray().length && res.isEmpty()){
					return false;
				}
				res.push(c);
				
			} else {
				char compare = c;
				if (res.isEmpty()){
					return false;
				}
				char stackTop = res.pop();
				if (bracketComparision(stackTop, compare)){
					result = true;
				} else {
					return false;
				}
			}
		}
		
		if (!res.isEmpty()) result = false;
		
		return result;
	}
	
	public boolean bracketComparision(Character one, Character two){
		if (one.equals('(')){
			if (two.equals(')')){
				return true;
			} else {
				return false;
			}
		} else if (one.equals('[')){
			if (two.equals(']')) {
				return true;
			} else {
				return false;
			}
		} else if (one.equals('{')){
			if (two.equals('}')) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public boolean OpenBracket(Character one){
		if (one.equals('{') || one.equals('[') || one.equals('(')) {
			return true;
		}
		return false;
	}
}