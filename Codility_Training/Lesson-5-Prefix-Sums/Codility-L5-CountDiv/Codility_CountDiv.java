class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(6, 11, 2));
		SolutionTwo sol2 = new SolutionTwo();
		System.out.println(sol2.solution(6, 11, 2));
	}
}

class Solution {
	public int solution(int A, int B, int K){
		int count = 0;
		
		for (int i = A; i <= B; i++){
			if (i % K == 0){
				count++;
			}
		}
		
		return count;
	}
}

//OneTwoSum similar
//Correctness is good, performance is bad, switch this to use prefix/suffix 

class SolutionTwo {
	public int solution(int A, int B, int K){
int countB = B / K;
		
int countA = (A - 1) / K;
		
int extra = (A % K == 0) ? 1 : 0;
		
return countB - countA + extra;
	}
}
// this gpt anwser is also wrong

