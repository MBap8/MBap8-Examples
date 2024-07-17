class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(1));
	}
}

class Solution {
	public int solution(int N){
		int sqrtN = (int) Math.sqrt(N); 
		int lowestPeri = 0;
		
		for(int i=1; i <= sqrtN; i++){
			if(N % i ==0){   
				int check = N/i;
				int peri = 2 * (i + check);
				if (lowestPeri == 0){
					lowestPeri = peri;
				} else {
					lowestPeri = Math.min(lowestPeri, peri);
				}
			}
		}
		return lowestPeri;
	}
}
// O(sqrt(N)) 
// 11 minutes