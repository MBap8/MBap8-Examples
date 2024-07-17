class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] A){
		
		int  numTriangle = 0;
		Arrays.sort(A);
		for(int i=0; i < A.length-2; i++){
			
			int leftEnd = i+1;
			int rightEnd = i+2;
			
			while(leftEnd < A.length-1){
				
				if(rightEnd < A.length && A[i] + A[leftEnd] > A[rightEnd]){
					rightEnd++;
				}
				else{
					numTriangle = numTriangle + (rightEnd - leftEnd - 1);
					leftEnd++;
				}
			}
		}
		
		return numTriangle;
	}
}