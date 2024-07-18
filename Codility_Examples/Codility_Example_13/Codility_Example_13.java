import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(String s){
		HashSet<Character> storageUpper = new HashSet<Character>();
		HashSet<Character> storageLower = new HashSet<Character>();
		HashSet<Character> storageContainer = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++){
			if (Character.isLowerCase(s.charAt(i))){
				if (!storageUpper.contains(s.charAt(i))){
					storageContainer.add(s.charAt(i));
				} else {
					storageContainer.remove(s.charAt(i));
					storageLower.remove(s.charAt(i));
				}
			} else {
				char lowerChar = Character.toLowerCase(s.charAt(i));
				storageUpper.add(lowerChar);
				if (storageContainer.contains(lowerChar)){
					storageLower.add(lowerChar);
				}
			}
		}
		return storageLower.size();
	}
}