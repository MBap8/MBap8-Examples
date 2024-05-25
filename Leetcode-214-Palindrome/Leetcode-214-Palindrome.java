import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String test = "abbacd";
		String result = sol.shortestPalindrome(test);
		System.out.println(result);
	}
}

class Solution {
	public String shortestPalindrome(String s) {
		List<Character> chars = new ArrayList<Character>();
		char[] strs = s.toCharArray();
		Integer midpoint = null;
		boolean midCheck = false;
		Integer midCheckPrev = null;
		Integer midpointRev = null;
		
		
		if (s.equals("")){
			return "";
		} else if (s.length() == 1){
			return s;
		}
		
		for (int i = 0; i < strs.length; i++) {
			int j = i+1;
			if (j == strs.length){
				midpoint = i;
				break;
			}
			if (midCheck){
				if (strs[midCheckPrev] == strs[j]){
					midpoint = i;
					break;
				} else {
					midpoint = midCheckPrev;
					break;
				}
			}
			if (strs[i] != strs[j]){
				if (i-1 != -1){
					if (strs[i] != strs[i-1]){
						midCheck = true;
						midCheckPrev = i;
						continue;
					}
				} else if (i == 0){
					midCheck = true;
					midCheckPrev = i;
					continue;
				}
			}
		}
		
		midCheck = false;
		
		int max = strs.length -1;
		

		
		for (int i = max; i >= 0; i--) {
			int j = i-1;
			if (j < 0){
				midpointRev = i + 1;
				break;
			}
			if (midCheck){
				if (strs[midCheckPrev] == strs[j]){
					midpointRev = i;
					break;
				} else {
					midpointRev = midCheckPrev;
					break;
				}
			}
			if (strs[i] != strs[j]){
				if (i + 1 != strs.length){
					if (strs[i] != strs[i+1]){
						midCheck = true;
						midCheckPrev = i;
						continue;
					}
				} else if (i == max){
					midCheck = true;
					midCheckPrev = i;
					continue;
				}

			}
		}
		if (midpoint == midpointRev){
			if (strs.length % 2 == 0){
				chars.add(strs[max]);
			} else {
				int endToMid = max - midpoint;
				int startToMid = midpoint - 0;
				int newLength = endToMid - startToMid;
				for (int i = max; i > max - newLength; i--) {
					chars.add(strs[i]);
				}
			}
		} else {
			for (int k = max; k > midpoint; k--){
				chars.add(strs[k]);
			}
		}
		
		for (char c : strs) {
			chars.add(c);
		}
		
		StringBuilder build = new StringBuilder(chars.size());
		
		for (Character c : chars){
			build.append(c);
		}
		
		return build.toString();
	}
}