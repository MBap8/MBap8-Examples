import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] sample = {1,5,9};
		int res = sol.roomsCalc(sample);
		System.out.println(res);
	}
}

class Solution {
	public int roomsCalc(int[] pref){
		int minRooms = pref[0];
		int rooms = 1;
		int oneRoomCalc = 1;
		ArrayList<Integer> roomsCheck = new ArrayList<>();
//		ArrayList<Integer> prefs = new ArrayList<>();
//		ArrayList<Integer> room = new ArrayList<>();
//		room.add(1);
//		prefs.add(pref[0]);
//		int incompleteRoom = 0;
		for (int i = 1; i < pref.length; i++) {
			if (pref[i] <= minRooms){
				if (minRooms > pref[i]){
					rooms++;
				} else {
					roomsCheck.add(oneRoomCalc + 1);
					oneRoomCalc = 0;
				}
			}
		}
//		for (int i = 1; i < pref.length; i++) {
//				if (oneRoomCalc + 1 <= pref[i] && minRooms >= oneRoomCalc + 1){
//					if (minRooms > pref[i]){
//						minRooms = pref[i];
//					} 
//					oneRoomCalc++;
//				} else {
//					rooms++;
//					minRooms = pref[i];
//					oneRoomCalc = 1;
//				}
//		}
		return rooms;
	}
}