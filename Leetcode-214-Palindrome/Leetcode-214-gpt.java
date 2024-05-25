class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String test = "abaa";
		String result = sol.shortestPalindrome(test);
		System.out.println(result);
	}
}

class Solution {
	public String shortestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == s.charAt(j)) {
				j++;
			}
		}
		
		if (j == s.length()) {
			return s; // The whole string is already a palindrome.
		}
		
		String suffix = s.substring(j);
		System.out.println(suffix);
		String prefix = new StringBuilder(suffix).reverse().toString();
		System.out.println(prefix);
		String mid = shortestPalindrome(s.substring(0, j));
		System.out.println(mid);
		
		return prefix + mid + suffix;
	}
}
