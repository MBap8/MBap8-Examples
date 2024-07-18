import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.wordPattern("aaaa", "dog cat cat dog"));
	}
}

class Solution {
	public boolean wordPattern(String pattern, String s){
		String[] splitStr = s.split("\\s+");
		if (pattern.length() != splitStr.length){
			return false;
		}
		HashMap<Character,String> sto = new HashMap<>();
		for (int i = 0; i < splitStr.length; i++){
			if (!sto.containsKey(pattern.charAt(i))){
				if (sto.containsValue(splitStr[i])){
					return false;
				} else {
					sto.put(pattern.charAt(i), splitStr[i]);
				}
			} else {
				if (!sto.get(pattern.charAt(i)).equals(splitStr[i])){
					return false;
				}
			}
		}
		return true;
	}
}