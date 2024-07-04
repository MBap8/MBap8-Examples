import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String senate = "DDRRR";
		String result = sol.predictPartyVictory(senate);
		System.out.println(result);
		
	}
}

class Solution {
	public String predictPartyVictory(String senate) {
		LinkedList<Character> senateVotes = new LinkedList<Character>();
		for (int i = 0; i < senate.length(); i++) {
			senateVotes.add(senate.charAt(i));
		}
		while (senateVotes.size() != 1){
			senateVotes = iterate(senateVotes);
		}
		String res = senateVotes.peekFirst().toString();
		
		if (res.equals("R")) {
			return "Radiant";
		} else {
			return "Dire";
		}
	}
	public LinkedList<Character> iterate(LinkedList<Character> senate){
		Iterator<Character> itr = senate.iterator();
		Character currentElement = null;
		Character nextElement = null;
		int skip = 1;
//		if (itr.hasNext()) {
//			currentElement = itr.next();
//		}
		while (itr.hasNext()) {
			currentElement = itr.next();
			
			
			if (currentElement.equals('D')){
				senate.removeFirstOccurrence('R');
			} else {
				senate.removeFirstOccurrence('D');
			}
		}
		if (senate.size() > 1){
			if (!senate.peekLast().toString().equals(senate.peekFirst().toString())){
				senate.removeFirst();
			}
		}
		if (skip == senate.size()){
			Character first = senate.getFirst();
			senate.clear();
			senate.add(first);
		}
		return senate;
	}
}