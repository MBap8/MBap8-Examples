class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(10, 85, 30));
	}
}

class Solution {
	public int solution(int X, int Y, int D){
//		int jumps = 0;
//		int res = X;
		
//		while (res < Y){
//			res += D;
//			jumps++;
//		}
		
		int diff = Y - X;
		double a = (double) diff/D;
		int jumps = (int) Math.ceil(a);
		
	
		return jumps;
	}
}

// 14 minutes

