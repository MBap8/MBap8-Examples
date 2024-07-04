import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] test = {"a","a"};
		List<List<String>> test3 = new ArrayList<List<String>>(sol.groupAnagrams(test));
		System.out.println(test3);
	}
}
		
		
		
		class Solution {
			public List<List<String>> groupAnagrams(String[] strs) {
				if (strs == null || strs.length == 0) return new ArrayList<>();
						Map<String, List<String>> map = new HashMap<>();
				
						for (String s : strs) {
							char[] chars = s.toCharArray();
							Arrays.sort(chars);
							String sorted = new String(chars);
							if (!map.containsKey(sorted)) {
								map.put(sorted, new ArrayList<>());
							}
							map.get(sorted).add(s);
						}
				
						return new ArrayList<>(map.values());
			}
		}