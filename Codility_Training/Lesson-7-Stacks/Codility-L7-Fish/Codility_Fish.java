import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] A, int[] B){
		if(A.length == 0)
		{
			return 0;
		}
					
				Stack<Integer> upStrm = new Stack<>(); 
				int numAlive = A.length;
		
				for(int i=0; i<A.length; i++){
					if(B[i] ==1){
						upStrm.push(A[i]);
					}
					if(B[i] ==0){
						while( !upStrm.isEmpty() ){ 
							if( upStrm.peek() > A[i] ){
								numAlive--;
								break;
							}
							else if(upStrm.peek() < A[i]){
								numAlive--;
								upStrm.pop();
							}
						}
					}  
				}    
		
				return numAlive;
	}
}

// O(N) 