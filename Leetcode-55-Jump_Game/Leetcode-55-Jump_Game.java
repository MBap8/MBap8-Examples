class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] res = {2,0};
		System.out.println(sol.canJump(res));
	}
}

class Solution {
	public boolean canJump(int[] nums) {
		int max = 0; 
		int length = nums.length;
		
		for (int i = 0; i < length; i++) {
			if (max < i) {
				return false;
			}
			max = Math.max(max, i + nums[i]);
			
			if (max >= length - 1) {
				return true;
			}
		}		
		return false;
	}
}