import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
	}
}

class Solution {
	public ArrayList<int[]> giveEvenPairs(int[] arr){
		ArrayList<int[]> res = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			int num1 = arr[i];
			int num2 = 0;
			int secondIndex = 0;
			if (i == arr.length - 1){
				num2 = arr[0];
				secondIndex = 0;
			} else {
				num2 = arr[i + 1];
				secondIndex = i + 1;
			}
			if (num1 % 2 == 0){
				if (num2 % 2 == 0){
					int[] pair = {i, secondIndex};
					res.add(pair);
				}
			}
		}
		
		return res;
	}
}