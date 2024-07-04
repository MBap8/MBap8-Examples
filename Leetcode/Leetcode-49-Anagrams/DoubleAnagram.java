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
		List<List<String>> lst = new ArrayList<List<String>>();
		List<String> strsList = new ArrayList<String>(Arrays.asList(strs));
		
		if (strsList.size() <= 1) {
			lst.add(strsList);
			return lst;
		}
		for (int i = 0; i < strsList.size();) {
			List<String> addList = new ArrayList<String>();
			addList.add(strsList.get(i));
			for (int j = i + 1; j < strsList.size();){
				char[] currItchar = strsList.get(i).toString().toCharArray();
				char[] nextItChar = strsList.get(j).toString().toCharArray();
				Arrays.sort(currItchar);
				Arrays.sort(nextItChar);
				String sortCurr = new String(currItchar);
				String sortNext = new String(nextItChar);
				if (sortCurr.equals(sortNext)){
					addList.add(strsList.get(j));
					strsList.remove(j);
				} else {
					j++;
				}
			}
			lst.add(addList);
			strsList.remove(i);
		}
		return lst;
	}
}