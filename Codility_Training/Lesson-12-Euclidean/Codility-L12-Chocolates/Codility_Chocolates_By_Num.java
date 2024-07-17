import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(20, 6));
	}
}
class Solution {
	public int solution(int N, int M){
		HashSet<Integer> eaten = new HashSet<Integer>();
		eaten.add(0);
		int next = (int)(0 + M) % N;
		while (!eaten.contains(next)){
			eaten.add(next);
			next = (int)(next + M) % N;
		}
		return eaten.size();
	}
}

// O(N + M), 100% correctness, bad performance

class SolutionTwo {
	public int solution(int N, int M) {
		
		// main idea: 
		// using "gcd(M, N)"
		// the number of eaten chocolates = N / gcd(M,N)
		return N/(gcd(N,M));
	}
	
	// using "Euclidean Algorithm" (important)
	public static int gcd(int a,int b){
		if(a % b == 0)
			return b;            // case 1
		else
			return gcd(b,a % b); // case 2 (key point)
	}
}
// O(log(N + M)) 