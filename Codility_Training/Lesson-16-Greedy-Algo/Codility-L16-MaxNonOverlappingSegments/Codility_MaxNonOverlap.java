class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] A, int[] B){
				if(A.length==0){
					return 0;
				}
				int currentLeftEnd = A[A.length - 1];
				int nonOverlap = 1;
		
				for(int i= A.length - 2; i >=0; i--){
					if(B[i] < currentLeftEnd){
						nonOverlap++;
						currentLeftEnd = A[i];
					}
					if(A[i] > currentLeftEnd){
						currentLeftEnd = A[i];
					}
				}
		
				return nonOverlap;
	}
}

// o(n)