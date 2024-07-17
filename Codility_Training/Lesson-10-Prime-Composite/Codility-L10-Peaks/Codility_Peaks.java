import java.util.*;
class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] A){
		ArrayList<Integer> indexFlags = new ArrayList<Integer>();

		
		int peaks = 0;
		
		for (int i = 1; i < A.length; i++){
			Integer before = A[i - 1];
			Integer after = 0;
			if (i + 1 < A.length){
				after = A[i + 1];
			} else {
				after = null;
			}
			if (after != null && (A[i] > before && A[i] > after)){
				indexFlags.add(i);
				peaks++;
			}
		}
		
		for(int numBlocks = A.length; numBlocks >=1; numBlocks--){
			
			if( A.length % numBlocks ==0){
				
				int blockSize = A.length / numBlocks; 
				int ithOkBlock =0;
				
				for(int indexPeaks : indexFlags){
					if( indexPeaks/blockSize == ithOkBlock){
						ithOkBlock++;
					}
				}   
	
				if(ithOkBlock == numBlocks){
					return numBlocks;
				}
			}
		}   
		
		return 0;
	}
}

// O(N * log(log(N))) 