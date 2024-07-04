class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] walls = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res = sol.trap(walls);
		System.out.println(res);
	}
}

class Solution {
	public int trap(int[] height) {
//		int prev = 0;
//		int next = 2;
//		int maxHeight = 0;
//		int water = 0;
//		for (int i = 1; next < height.length; i++) {
//			if (height[prev] > height[i] && height[next] > height[i]){
//				maxHeight = Math.max(height[prev], maxHeight);
//				maxHeight = Math.max(height[next], maxHeight);
//				maxHeight = Math.max(height[i], maxHeight);
//				if (height[prev] == height[next]){
//					water += maxHeight;
//				} else if (height[prev] < height[next]){
//					water += prev;
//				} else {
//					water += next;
//				}
//			}
//			next++;
//			prev++;
//		}
//		return water;
		if (height == null || height.length == 0) {
			return 0;
		}
		
		int left = 0;
		int right = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int water = 0;
		
		while (left < right) {
			if (height[left] < height[right]) {
				if (height[left] >= leftMax) {
					leftMax = height[left];
				} else {
					water += leftMax - height[left];
				}
				left++;
			} else {
				if (height[right] >= rightMax) {
					rightMax = height[right];
				} else {
					water += rightMax - height[right];
				}
				right--;
			}
		}
		
		return water;
	}
}