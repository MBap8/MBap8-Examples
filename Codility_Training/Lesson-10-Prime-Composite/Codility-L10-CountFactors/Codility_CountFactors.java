class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(24));
		System.out.println(sol.solution(3));
	}
}

class Solution {
	public int solution(int N){
		int factors = 1;
		for (int i = 2; i <= N; i++){
			if (N % i == 0){
				factors++;
			}
		}
	
		return factors;
	}
}

// MinDistinct similar to
// Performance is not good


class SolutionTwo {
	public int solution(int N){
		int i = 1;
		int result = 0;
		
		while (i * i < N){
			if (N % i == 0){
				result += 2;
			}
			i += 1;
		}
		
		if (i * i == N){
			result += 1;
		}
		
		return result;
	}
}

// Correctness 100%, performance 1 failed 
// o(sqr(n))

class SolutionThree {
	public int solution(int N){
		// main idea:
		// check from 1 to "sqrt_of_N" 
		// then, taking its pair into consideration
		// ---> numFactor = numFactor * 2;
		
		int sqrtN = (int) Math.sqrt(N); 
		int numFactor =0; // number of factors
		
		// check if i is a factor or not (by using N % i ==0)
		for(int i=1; i <= sqrtN; i++){
			if(N % i ==0){   
				numFactor++;
			}
		}
		
		numFactor = numFactor * 2; // add its pair
		
		// be careful: check if "sqrtN * sqrtN == N"
		if( sqrtN * sqrtN == N){   
			numFactor = numFactor -1; // minus one: avoid double counting
		}
		
		return numFactor;
	}
}

// GitHub soluton O(sqrt(N)) 