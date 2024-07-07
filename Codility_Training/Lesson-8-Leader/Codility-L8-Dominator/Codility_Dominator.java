import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {3,4,3,2,3,-1,3,3};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		int size = 0;
		int value = 0;
		int candidate = -1;
		for (int i = 0; i < A.length; i++) {
			if (size == 0){
				size += 1;
				value = A[i];
			} else {
				if (value != A[i]){
					size -= 1;
				} else {
					size += 1;
				}
			}
		}
		
		if (size > 0){
			candidate = value;
		}
		int leader = -1;
		int count = 0;
		for (int i = 0; i < A.length; i++){
			if (A[i] == candidate){
				count += 1;
			}
			if (count > Math.floorDiv(A.length, 2)){
				leader = i;
			}
		}
		return leader;
	}
}
//Similar to TheWidestPath or AdjacentPointsMaxDistance
// O(N*log(N)) or O(N) not 100% correct

class SolutionTwo {
	public int solution(int[] A){
		// Using "hashMap" for counting
		Map<Integer, Integer> map = new HashMap<>();      
		
		// 1. Counting
		// map(key, value) ---> map(number, count)
		for(int i=0; i<A.length; i++){
			if( !map.containsKey(A[i]) ){ // new number
				map.put(A[i],1);          // "put" new number
			}
			else{
				int count = map.get(A[i]); // "get" count
				map.put(A[i], count+1);    // count++
			}
		}
		
		// 2. find the max number of counts
		int max_Number =0;
		int max_Count =0; 
		// note: use "map.keySet()" in for loop 
		for( int key: map.keySet() ){
			int cur_Count = map.get(key); // get value
			if( cur_Count > max_Count){
				max_Count = cur_Count;    // update max count
				max_Number = key;
			}
		}
		
		// 3. check if there is a "dominator" or not
		if( max_Count > (A.length)/2 ){
			// then, max_Number is the "dominator"
		}
		else{
			return -1; // no dominator
		}
		
		// 4. return "any index" of "the dominator"
		for(int i=0; i<A.length; i++){
			if(A[i] == max_Number){
				return i; // return the index
			}
		}
		
		return -1;
	}
}
