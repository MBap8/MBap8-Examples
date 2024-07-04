import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] sample = {2,7,2,9,8};
		int res = sol.roomsCalc(sample);
		System.out.println(res);
	}
}

class Solution {
	public int roomsCalc(int[] pref){
		Arrays.sort(pref);
		ArrayList<Integer> prefs = new ArrayList<>();
		int fullRoom = 0;
		prefs.add(pref[0] - 1);
		int prevRoom = 0;
		for (int i = 1; i < pref.length; i++) {
			while (prefs.get(fullRoom) == 0){
				if (fullRoom + 1 >= prefs.size()){
					break;
				}
				fullRoom++;
			}
			if (pref[i] == 1){
				prefs.add(0);
			} else if (prefs.get(fullRoom) > 0){
				if (prefs.get(fullRoom) > pref[i]){
					prefs.remove(fullRoom);
					prefs.add(fullRoom, pref[i] - 1);
				} else {
					int removed = prefs.remove(fullRoom);
					prefs.add(fullRoom, removed - 1);
				}
			} else {
				prefs.add(pref[i] - 1);
			}
			
		}
		return prefs.size();
	}
}