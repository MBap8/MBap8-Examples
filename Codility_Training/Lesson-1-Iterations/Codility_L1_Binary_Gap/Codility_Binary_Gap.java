class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(1041));
	}
}

class Solution {
	public int solution(int n){
		int gap = 0;
		String s = String.valueOf(Integer.toBinaryString(n));
		
		int tempGap = 0;
		boolean gapBegins = false;
		boolean intGap = false;
		
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == '1'){
				gapBegins = true;
				if (intGap){
					intGap = false;
					gap = Math.max(gap, tempGap);
					tempGap = 0;
				}
			}
			if (s.charAt(i) == '0'){
				if(gapBegins){
					intGap = true;
					tempGap++;
				}
			}
		}
		return gap;
	}
}

// MinDistinct Similar test