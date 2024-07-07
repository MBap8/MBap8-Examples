import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("((()))()"));
	}
}

class Solution {
	public int solution(String S){
		Stack<Character> brackets = new Stack<>();
		
		if (S.length() == 0){
			return 1;
		} else if (S.length() == 1){
			return 0;
		}
		
		for (int i = 0; i < S.length(); i++){
			if (S.charAt(i) == '('){
				brackets.push(')');
			} else {
				if (brackets.isEmpty()){
					return 0;
				} else {
					brackets.pop();
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

// 11 minutes, o(n)
// EraseAdjacentLetters