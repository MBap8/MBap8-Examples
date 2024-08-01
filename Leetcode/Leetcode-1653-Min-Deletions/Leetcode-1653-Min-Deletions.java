import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.minimumDeletions("aababbab"));
	}
}


class Solution {
	public int minimumDeletions(String s) {

		Stack<Character> store = new Stack<>();
		int count = 0;
		
		for (int i = s.length() - 1; i >= 0; i--){
			if (!store.isEmpty() && store.peek() == 'a'){
				store.pop();
				count++;
			} else {
				store.push(s.charAt(i));
			}
		}
		
		
		
		
		return count;
		
//		class Solution {
//			public int minimumDeletions(String s) {
//				int res = 0, count = 0;
//				for (char c : s.toCharArray()){
//					if (c == 'b')
//						count++;
//					else if (count != 0){
//						res++;
//						count--;
//					}
//				}
//				return res;
//			}
//		}
		
	}
}


//		int i = 0;
//		int j = s.length() - 1;
//		int startA = 0;
//		int startB = 0;
//		int countA = 0;
//		int countB = 0;
//		for (int k = 0; k < s.length(); k++){
//			if (s.charAt(k) == 'a'){
//				countA++;
//			} else {
//				countB++;
//			}
//		}
//		while (i < j){
//			if (s.charAt(i) == 'b'){
//				startB++;
//			}
//			
//			if (s.charAt(j) == 'a'){
//				startA++;
//			}
//			
//			i++;
//			j--;
//		}
//		if (countA == countB){
//			return startA + startB;
//		} else if (countA > countB){
//			return startB;
//		} else {
//			return startA;
//		}