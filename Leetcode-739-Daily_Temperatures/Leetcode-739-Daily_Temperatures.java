import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] temps = {73,74,75,71,69,72,76,73};
		int[] res = sol.dailyTemperatures(temps);
		for (int i : res){
			System.out.println(res[i]);
		}
	}
}

class Solution {
	public int[] dailyTemperatures(int[] temperatures) {
		
		int[] result = new int[temperatures.length];
		Stack<Integer> index = new Stack<Integer>();
		
				for (int i = 0; i < temperatures.length; i++){
					while (!!index.isEmpty() && (temperatures[i] > temperatures[index.peek()])) {
						int res = i - index.peek();
						result[index.pop()] = res;
					}
					index.push(i);
				}
				return result;
			
	}
}