import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s1 = "ab";
		String s2 = "eidboaoo";
		boolean check = sol.checkInclusion(s1, s2);
		System.out.println(check);
		
	}
}

class Solution {
	public boolean checkInclusion(String s1, String s2) {
		
//		int windowSize = s1.length();
//		int startIndex = 0;
//		int endIndex = windowSize - 1;
//		
//		LinkedList<Character> charS1 = new LinkedList<>();
//		
//		
//		for (char c : s1.toCharArray()){
//			charS1.add((Character)c);
//		}
//		
//		while (endIndex < s2.length()){
//			ArrayList<Character> charCheck = new ArrayList<>();
//			for (int i = startIndex; i <= endIndex; i++){
//				charCheck.add((Character)s2.charAt(i));
//			}
//			if (checker(charCheck, new LinkedList<>(charS1))){
//				return true;
//			} else {
//				startIndex++;
//				endIndex++;
//			}
//		}
//		
//		return false;
		
		int[] s1Freq = new int[26];
			int[] windowFreq = new int[26];
			for (char c : s1.toCharArray()) {
				s1Freq[c - 'a']++;
			}
		int windowSize = s1.length();
		for (int i = 0; i < windowSize; i++) {
			windowFreq[s2.charAt(i) - 'a']++;
		}
		for (int i = windowSize; i < s2.length(); i++) {
			if (Arrays.equals(s1Freq, windowFreq)) {
				return true;
			}
			windowFreq[s2.charAt(i - windowSize) - 'a']--;
			windowFreq[s2.charAt(i) - 'a']++; 
		}
		return Arrays.equals(s1Freq, windowFreq);
	}
	
//	public boolean checker(ArrayList<Character> charList, LinkedList<Character> s1Char){
//		for (Character c : charList){
//			if (s1Char.contains(c)){
//				s1Char.remove(c);
//			}
//		}
//		return s1Char.size() == 0;
//	}
}