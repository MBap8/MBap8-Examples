class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "abc";
		String p = "a***";
		boolean a = sol.isMatch(s,p);
		System.out.println(a);
	}
}

class Solution {
	public boolean isMatch(String s, String p) {
		String a = s.replaceAll("\\*{2,}", "*");
		return s.matches(a);
	}
}