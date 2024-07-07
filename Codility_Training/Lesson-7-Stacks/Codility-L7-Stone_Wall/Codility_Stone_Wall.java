import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {8,8,8,8,8,9,8,8,9,8};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] H){
		Stack<Integer> base = new Stack<>();
		HashSet<Integer> top = new HashSet<>();
		int topCount = 0;
		base.push(H[0]);
		for (int i = 1; i < H.length; i++) {
			if (base.peek() > H[i]){
				base.push(H[i]);
				top.clear();
			} else if (base.peek() < H[i]){
				if (!top.contains(H[i])){
					top.add(H[i]);	
					topCount++;
				}
			}
		}
		
		return base.size() + topCount;
	}
}

// correctness was wrong in some instances, here if there are 2 same blocks not conseq, we don't add an additional block


class SolutionTwo {
	public int solution(int[] H){
				// main idea: need to use "stack" to check when we need a new block
		
				Stack<Integer> st = new Stack<>();
				int numBlock =0;
		
				// note: H[i] is the ith height of the wall
				for(int i=0; i< H.length; i++){
					
					// step 1: "stack is not empty" AND "from high to low"
					// then, "pop" (it is the key point, be careful)
					while( st.isEmpty()==false && st.peek() > H[i] ){
						st.pop();
					}
					// step 2: if the stack is empty
					if( st.isEmpty() ){
						numBlock++;     // add a block
						st.push(H[i]);  // push the height
					}
					// step 3: the height is the same: do nothing
					else if( st.peek() == H[i] ){
					} 
					// step 4: from low to high 
					else if( st.peek() < H[i] ){
						numBlock++;    // add a block
						st.push(H[i]); // push the height
					}
				}
		
				return numBlock;
	}
}

// Git solution 