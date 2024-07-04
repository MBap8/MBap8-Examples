class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {3,8,9,7,6};
		int[] res = sol.solution(arr,3);
		System.out.println(res.toString());
	}
}

class Solution {
	public int[] solution(int[] A, int K){
		int[] res = A;
		int iter = 1;
		
		if (A.length == 0){
			return A;
		}
		
		while (iter <= K){
			int[] temp = new int[A.length];
			temp[0] = res[res.length - 1];
			for (int i = 0; i < res.length - 1; i++){
				temp[i + 1] = res[i];
			}
			
			res = temp;
			iter++;
		}
		
		
		return res;
	}
}

// 16 mins
