import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {-5,-3,-1,0,3,6};
		System.out.println(sol.solution(test));
	}
}


class Solution {
	public int solution(int[] A){
		int front = 0;
		int back = A.length - 1;
		HashSet<Integer> dis = new HashSet<Integer>();
		while (front <= back){
			if (front == back){
				if (!dis.contains(Math.abs(A[front]))){
					dis.add(Math.abs(A[front]));
				}
				front++;
			} else {
				if (!dis.contains(Math.abs(A[front]))){
					dis.add(Math.abs(A[front]));
				}
				if (!dis.contains(Math.abs(A[back]))){
					dis.add(Math.abs(A[back]));
				}
				front++;
				back--;
			}
		}
		return dis.size();
	}
}

// ValueOccurrences 
// O(N) or O(N*log(N)) 
// 12 minutes