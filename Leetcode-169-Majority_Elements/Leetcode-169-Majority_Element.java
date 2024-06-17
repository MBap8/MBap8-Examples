import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {2,2,1,1,1,2,2};
		int res = sol.majorityElement(test);
		System.out.println(res);
	}
}

class Solution {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int check1 = 0;
		int check2 = 0;
		int highNum = nums[0];
		for (int i = 1; i < nums.length; i++){
			if(nums[i-1] != nums[i]){
				if (check1 < check2){
					highNum = nums[i-1];
					check1 = check2;
					check2 = 0;
				}
			} else if(i+1 == nums.length){
				if (nums[i-1] == nums[i]){
					check2++;
					if (check1 < check2){
						highNum = nums[i-1];
						check1 = check2;
						check2 = 0;
					}
				}
		}else {
				check2++;
			}
		}
		return highNum;
	}
}