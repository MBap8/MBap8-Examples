class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "MDLXX";
		int res = sol.romanToInt(s);
		System.out.println(res);
	}
}

class Solution {
	public int romanToInt(String s) {
		char[] characters = s.toCharArray();
		int result = 0;
		for (int i = 0; i < characters.length; i++) {
			int j = i + 1;
			int converted = romanConversion(characters[i]);
			if (j < characters.length && (characters[i] == 'I' && (characters[j] == 'X' || characters[j] == 'V') || characters[i] == 'X' && (characters[j] == 'L' || characters[j] == 'C') || characters[i] == 'C' && (characters[j] == 'D' || characters[j] == 'M'))) {
				int nextCon = romanConversion(characters[j]);
				result += nextCon - converted;
				i++;
			} else {
				result += converted;
			}
		}
		return result;
	}
	
	public int romanConversion(char c){
		if (c == 'I') {
			return 1;
		} else if (c == 'V'){
			return 5;
		} else if (c == 'X') {
			return 10;
		} else if (c == 'L') {
			return 50;
		} else if (c == 'C') {
			return 100;
		} else if (c == 'D') {
			return 500;
		} else if (c == 'M') {
			return 1000;
		} else {
			return 0;
		}
	}
}