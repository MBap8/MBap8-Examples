class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] levels = {5,8,3,9,10,12,53};
		int diff = 3;
		int res = sol.days(levels, diff);
		System.out.println(res);
	}
}

class Solution {
	public int days(int[] levels, int diff){
		int days = 0;
		for (int i = 0; i < levels.length;){
			int num1 = levels[i];
			int num2 = 1000;
			if (i+1 < levels.length){
				num2 = levels[i+1];
			}
			if (num2 - num1 <= diff){
				days++;
				i = i + 2;
			} else {
				days++;
				i++;
			}
		}
		return days;
	}
}