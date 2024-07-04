import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] input = {3,2,2,3};
		int val = 3;
		int result = sol.removeElement(input, val);
		System.out.println(result);
		System.out.println(Arrays.toString(input));
	}
}

class Solution {
	public int removeElement(int[] nums, int val) {
		List<Integer> newL = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != val){
				newL.add(nums[i]);
			}
		}
		
		for (int i = 0; i < newL.size(); i++){
			nums[i] = newL.get(i);
		}
		
		return newL.size();
	}
}

// Accepted 0ms runtime, 41.66mb memory