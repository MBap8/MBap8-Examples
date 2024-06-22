class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] levels = {5,8,3,9,10,12,53};
		int diff = 3;
		int res = sol.newDays(levels, diff);
		System.out.println(res);
		System.out.println(sol.days(levels, diff));
	}
}

class Solution {
	// this solution is wrong
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
	
	// new solution
	public int newDays(int[] levels, int diff){
		if (levels.length == 1){
			return 1;
		}
		int days = 0;
		int minDiff = levels[0];
		int maxDiff = levels[0];
		for (int i = 1; i < levels.length; i++){
			if (minDiff > levels[i]){
				minDiff = levels[i];
			} else if (maxDiff <= levels[i]){
				maxDiff = levels[i];
			}
			
			if (maxDiff - minDiff > diff){
				days++;
				minDiff = levels[i];
				maxDiff = levels[i];
				if (i + 1 >= levels.length){
					days++;
				}
			}
			
		}
		return days;
	}
}