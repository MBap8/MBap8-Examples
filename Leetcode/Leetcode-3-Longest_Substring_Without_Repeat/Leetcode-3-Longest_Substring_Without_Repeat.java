import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String te = "jlygy";
		int res = sol.lengthOfLongestSubstring(te);
		System.out.println(res);
	}
}
class Solution {
	public int lengthOfLongestSubstring(String s) {
		ArrayList<Character> contains = new ArrayList<Character>();
		LinkedList<Character> subString = new LinkedList<Character>();
		int highestSubstring = 0;
		int currSubstring = 0;
		if (s.length() == 1){
			return 1;
		}
		for (int i = 0; i < s.length(); i++) {
				if (!subString.contains(s.charAt(i))) {
					subString.add(s.charAt(i));
					currSubstring = subString.size();
				} else {
					Character last = subString.getLast();
					if (last != (Character)s.charAt(i)){
						if (currSubstring > highestSubstring){
							highestSubstring = currSubstring;
						}
						int index = subString.indexOf(s.charAt(i));
						if (index > 0){
							for (int j = 0; j <= index; j++){
								subString.remove(0);
							}
						} else {
							subString.remove(index);
						}
						subString.add(s.charAt(i));
						currSubstring = subString.size();
					} else {
						if (currSubstring > highestSubstring){
							highestSubstring = currSubstring;
						}
						subString.clear();
						subString.add(s.charAt(i));
					}
				}
			
		}
		
		if (currSubstring > highestSubstring){
			highestSubstring = currSubstring;
		}
		
		return highestSubstring;
	}
}