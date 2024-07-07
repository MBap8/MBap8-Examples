import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {-1,-3};
		System.out.println(sol.soluton(test));
	}
}

class Solution {
	public int soluton(int[] A){
		Arrays.sort(A);
		int min = 1;
		for (int i : A) {
			if (i == min) {
			min++;
			}
		}
		
		return min;
	}
}