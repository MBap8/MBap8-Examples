import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("racecar"));
	}
}

class Solution {
	public int solution(String S){
		int midPoint = (int)Math.ceil(S.length()/2);
		Stack<Character> ch = new Stack<>();
		if (S.length() == 0){
			return -1;
		}
		for (int i = 0; i < S.length(); i++){
			if (i < midPoint){
				ch.add(S.charAt(i));
			} else if (i > midPoint){
				if (S.charAt(i) != ch.pop()){
					return -1;
				}
			}
		}
		
		if (ch.isEmpty()){
			return midPoint;
		} else {
			return -1;
		}
	}
}

// EraseAdjacentLetters.