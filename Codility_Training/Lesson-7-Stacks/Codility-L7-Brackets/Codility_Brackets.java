import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("([)()]"));
	}
}

class Solution {
	public int solution(String S){
		if (S.length() == 1){
			return 0;
		}
		if (S.length() == 0){
			return 1;
		}
		Stack<Character> brackets = new Stack<>();
		for (char c : S.toCharArray()){
			if (c == '(' || c == '{' || c == '['){
				brackets.push(c);
			} else {
				if (brackets.isEmpty()){
					return 0;
				}
				char open = brackets.pop();
				if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')){
					return 0;
				}
			}
		}
		
		if (brackets.isEmpty()){
			return 1;
		} else {
			return 0;
		}
		
	}
	
}

//This solution was partially wrong in correctness and performance
