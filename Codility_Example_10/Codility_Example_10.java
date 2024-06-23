class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.moves("<^><v>>"));
	}
}

class Solution {
	public int moves(String s){
		int numMoves = 0;
		if (s.length() == 1){
			return 1;
		}
		Character prevMove = 'e';
		Character currMove = null;
		Character nextMove = null;
		for (int i = 0; i < s.length(); i++){
			currMove = s.charAt(i);
			if (i + 1 < s.length()){
				nextMove = s.charAt(i +1);
			} else {
				nextMove = 'e';
			}
			boolean isMove = corrMove(prevMove, currMove, nextMove);
			if (isMove){
				numMoves++;
			}
			prevMove = s.charAt(i);
		}
		
		return numMoves;
	}
	public boolean corrMove(char prev, char curr, char next){
		if (curr == '<'){
			if (prev == '>'){
				return false; 
			}
		} else if (curr == '>'){
			if (next != 'e'){
				return false;
			}
		} 
		return true;
	}
}