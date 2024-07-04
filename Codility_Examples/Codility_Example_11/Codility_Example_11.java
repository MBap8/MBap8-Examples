class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		char[] paved = {'.','.','X','X','.','X'};
		System.out.println(sol.rePave(paved));
	}
}

class Solution {
	public int rePave(char[] road){
		int paved = 0;
		for (int i = 0; i < road.length;) {
			if (road[i] == '.'){
				i++;
			} else {
				paved++;
				i += 3;
			}
		}
		
		return paved;
	}
}