import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {1,2,3};
		List<List<Integer>> res = sol.permute(nums);
		System.out.println(res.toString().toString());
		
	}
}

class Solution {
//	public List<List<Integer>> permute(int[] nums) {
//		List<List<Integer>> results = new ArrayList<List<Integer>>();
//		for (int i = 0; i < nums.length; i++) {
//			List<Integer> replace = Arrays.asList((Integer)nums);
//			int rotations = 0;
//			while (rotations <= nums.length - 1){
//				ArrayList<Integer> add = new ArrayList<Integer>();
//				add.add(nums[i]);
//				for (int j = 0; j < nums.length; j++) {
//					int newIndex = (j + rotations) % nums.length;
//					if (nums[newIndex] != nums[i]){
//						add.add(nums[newIndex]);
//					} else if (newIndex == j && nums[newIndex] != nums[i]){
//						break;
//					}
//				}
//				rotations++;
////				System.out.println(add.toString());
//				if (add.size() == nums.length) results.add(add);
//			}
//		}
//		return results;
//	}
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> results = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		backtrack(nums, results, current, used);
		return results;
	}
	
	private void backtrack(int[] nums, List<List<Integer>> results, List<Integer> current, boolean[] used) {
		if (current.size() == nums.length) {
			results.add(new ArrayList<>(current));
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			current.add(nums[i]);
			backtrack(nums, results, current, used);
			current.remove(current.size() - 1);
			used[i] = false;
		}
	}
}