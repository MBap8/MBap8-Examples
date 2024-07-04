class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String test = "ABBABABA";
		int sols = sol.returnDeletions(test);
		System.out.println(sols);
		
	}
}

class Solution {
	enum Letters {
		A,B
	};
	public int returnDeletions(String s){
		
		int deletionsA = 0;
		int deletionsB = 0;
		int forcedDelA = 0;
		int forcedDelB = 0;
		boolean forceA = true;
		boolean forceB = true;
		int indexStart = 0;
		int indexEnd = s.length() - 1;
		
		while (indexStart < indexEnd){
			if (indexStart >= indexEnd){
				break;
			}
			if (s.charAt(indexEnd) == 'B'){
				if (forceB){
					forceB = false;
					deletionsA += forcedDelA;
				}
				indexEnd--;
			} else {
				if (forceB){
					forcedDelA++;
				} else {
					deletionsA++;
				}
				indexEnd--;
			}
			if (s.charAt(indexStart) == 'A') {
				if (forceA){
					forceA = false;
					deletionsB += forcedDelB;
				}
				indexStart++;
			} else {
				if (forceA){
					forcedDelB++;
				} else {
					deletionsB++;
				}
				indexStart++;
			}
		}
		
		return deletionsA + deletionsB;
		
	}
}