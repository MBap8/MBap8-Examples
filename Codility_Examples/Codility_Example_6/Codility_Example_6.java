class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int n = 49;
		String res = sol.generateString(n);
		System.out.println(res);
	}
}

class Solution {
	public String generateS(int n){
		StringBuilder sb = new StringBuilder();
		int repeat = 0;
		int letter = 0;
		if (n > 26){
			repeat = findLowestDivisor(n);
		}
		
		for (int i = 0; i < n; i++){
			int computeRepeat = repeat;
			if (repeat > 0){
				sb.append(String.valueOf((char)('a' + letter)).repeat(repeat));
				letter++;
				i+= repeat - 1;
			} else {
				sb.append((char)('a' + letter));
				letter++;
			}

		}
		
		return sb.toString();
	}
	
		public static int findLowestDivisor(int num) {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					return i;
				}
			}
			return num;
		}
	
	public String generateString(int n) {
		StringBuilder sb = new StringBuilder();
		int letter = 0;
		int repeat = 1;
		
		if (n > 26) {
			repeat = findLowestDivisor(n);
		}
		
		for (int i = 0; i < n; i++) {
			sb.append((char) ('a' + letter));
			if ((i + 1) % repeat == 0) {
				letter = (letter + 1) % 26;
			}
		}
		
		return sb.toString();
	}
}

//class Solution {
//	public String generateS(int n) {
//		StringBuilder sb = new StringBuilder();
//		int repeat = 1;
//		int letter = 0;
//		
//		if (n > 26) {
//			repeat = findLowestDivisor(n);
//		}
//		
//		for (int i = 0; i < n; i++) {
//			sb.append((char) ('a' + letter));
//			if ((i + 1) % repeat == 0) {
//				letter = (letter + 1) % 26;
//			}
//		}
//		
//		return sb.toString();
//	}
//	
//	public static int findLowestDivisor(int num) {
//		for (int i = 2; i * i <= num; i++) {
//			if (num % i == 0) {
//				return i;
//			}
//		}
//		return num;
//	}
//}