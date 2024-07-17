class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(24));
	}
}

class Solution {
	public int solution(int N){
//		int maxNum = 0;
//		for (int i = 1; i <= N; i++){
//			if (N % i == 0){
//				boolean poTwo = isPowerOfTwoUsingLoopDivision(i);
//				if (poTwo){
//					int n = 0;
//					if (i > 2) {
//						n = (int)Math.log(i) / (int)Math.log(2);
//					} else if (n > 1) {
//						n = 1;
//					}
//					maxNum = Math.max(maxNum, n);
//				}
//			}
//		}
//		return maxNum;
		for (int i = 0; i <= N;) {
			int checker = (int)Math.pow(2, i);
			if (N % checker == 0){
				i++;
			} else {
				return i - 1;
			}
		}
		return 0;
	}
	
	
//	public boolean isPowerOfTwoUsingLoopDivision(int n) {
//		while (n != 1 && n % 2 == 0) {
//			n /= 2;
//		}
//		return n == 1;
//	}
}

// OneTwoSum	