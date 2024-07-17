class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(Tree T) {
		if (T==null)
			return -1;
		return 1+Math.max(solution(T.l), solution(T.r));
	}
}