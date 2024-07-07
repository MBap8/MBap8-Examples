class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int[] solution(String s, int[] P, int[] Q){
		int[] sol = new int[P.length];
		
		for (int i = 0; i < P.length; i++){
			int pCurr = P[i];
			int qCurr = Q[i];
			
		}
		
		return sol;
	}
	
	public int checker(char s){
		if (s == 'A'){
			return 1;
		} else if (s == 'C'){
			return 2;
		} else if (s == 'G'){
			return 3;
		} else if (s == 'T'){
			return 4;
		}
		return 0;
	}
}