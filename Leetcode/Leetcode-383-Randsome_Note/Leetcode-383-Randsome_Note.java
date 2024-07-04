import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String a = "aa";
		String b = "abb";
		boolean res = sol.canConstruct(a, b);
		System.out.println(res);
	}
}

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		LinkedList<Character> ll = new LinkedList<>();
		for (int i = 0; i < magazine.length(); i++){
			ll.add(magazine.charAt(i));
		}
		boolean prev = false;
		for (int i = 0; i < ransomNote.length(); i++){
			if (ll.contains(ransomNote.charAt(i))){
				ll.remove((Character)ransomNote.charAt(i));
			}
		}
		int size = magazine.length() - ransomNote.length();
		if (ll.size() == size){
			return true;
		} else {
			return false;
		}
	}
}